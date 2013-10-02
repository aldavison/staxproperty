/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrewrite;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author helpdesk
 */
public class Assets {
    
    private String returnYear;     
    private String countyNumber;
    private int assetID;
    private String description;
    private Date acquiredDate;
    private double cost;
    private String category;
    private boolean disposed;
    private Date disposedDate;
    private String disposedMethod;
  
    public Assets(){
        
    }
    
     
    public Assets(String rtnYear, String coNum, int assID,
            String desc, Date aqDate, double cost,String cat, 
            boolean disposed, Date dispDate, String disposedMeth ){
        
        
        this.returnYear=rtnYear;
        this.countyNumber=coNum;
        this.assetID=assID;
        this.description=desc;
        this.acquiredDate=aqDate;
        this.cost=cost;
        this.category=cat;
        this.disposed=disposed;
        this.disposedDate=dispDate;
        this.disposedMethod=disposedMeth;
        
    }
    
    
 /***************************************************************
  *                                                             *
  *      Getter Methods                                         *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/   
    
    public String getReturnYear() {
        return returnYear;
    }

    public String getCountyNumber() {
        return countyNumber;
    }

    public int getAssetID() {
        return assetID;
    }

    public String getDescription() {
        return description;
    }

    public Date getAcquiredDate() {
        return acquiredDate;
    }

    public double getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public boolean isDisposed() {
        return disposed;
    }

    public Date getDisposedDate() {
        return disposedDate;
    }

    public String getDisposedMethod() {
        return disposedMethod;
    }
    
    
 /***************************************************************
  *                                                             *
  *      Setter Methods                                         *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/     
    
    public void setReturnYear(String returnYear) {
        this.returnYear = returnYear;
    }

    public void setCountyNumber(String countyNumber) {
        this.countyNumber = countyNumber;
    }

    public void setAssetID(int assetID) {
        this.assetID = assetID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAcquiredDate(Date acquiredDate) {
        this.acquiredDate = acquiredDate;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDisposed(boolean disposed) {
        this.disposed = disposed;
    }

    public void setDisposedDate(Date disposedDate) {
        this.disposedDate = disposedDate;
    }

    public void setDisposedMethod(String disposedMethod) {
        this.disposedMethod = disposedMethod;
    }
    
    
    
}

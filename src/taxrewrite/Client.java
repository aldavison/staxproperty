/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrewrite;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author helpdesk
 */
public class Client {
    //have assets
       
    private ArrayList<Assets> assets;  //each client will hold their own assets, make sure to bring this up
    
    private ArrayList<PropertyReturn> propertyReturns;
    
    private String clientId; //ask about this data type
    
    private String CompanyName;
    
    private String addr1;
    
    private String addr2;
    
    private String city;
    
    private String state;
    
    private String zip; //ask about this data type
    
    private String countyName;
    
    private String countyNumber; //ask about data type
    
    private String phoneNo;
  
    private String extension; 
    
    private String email;
    
    private String FaxNo;
    
    private String contact; //Contact what? We already have a number
    
    private String title;
    
    private String fein;
    
    private String stn;
           
    private String stateId;
    
    private String naics;
    
    private String lastedIt;
    
    private boolean active;
    
    private SimpleStringProperty compName;
    
    
 /***************************************************************
  *                                                             *
  *                    Constructors                             *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/   
    
   
            
        public Client(String clientId, String companyName, String addr1,
                      String addr2, String city, String state, String zip, 
                      String countyName, String countyNumber, String phoneNo,
                      String extension, String email, String faxNo, String contact, 
                      String title, String fein, String stn, String stateId, String naics,
                      String lastedIt, boolean active)
        {
            
            if(clientId.length()<=12)
                this.clientId=clientId;
            
            if(companyName.length()<=40){
                this.CompanyName=companyName;
                this.compName= new SimpleStringProperty(this.CompanyName);
            }
            if(addr1.length()<=30)
                this.addr1=addr1;
            
            if(addr2.length()<=30)
                this.addr2=addr2;
            
            if(city.length()<=20)
                this.city=city;
            
            if(state.length()<=2)
                this.state=state;
            
            if(zip.length()<=10)
                this.zip=zip;
            
            if(countyName.length()<=15)
                this.countyName=countyName;
            
            if(countyNumber.length()<=4)
                this.countyNumber=countyNumber;
            
            if(phoneNo.length()<=12)
                this.phoneNo=phoneNo;
            
            if(extension.length()<=4)
                this.extension=extension;
            
            if(email.length()<=50)
                this.email=extension;
            
            if(faxNo.length()<=15)
               this.email=extension;
            
            if(contact.length()<20)
               this.email=extension;
            
            if(title.length()<20)
                this.title=title;
            
            if(fein.length()<15)
                this.fein=fein;
            
            if(stn.length()<15)
                this.stn=stn;
            
            if(stateId.length()<15)
                this.stateId=stateId;
            
            if(naics.length()<15)
                this.naics= naics;
            
            if(lastedIt.length()<8)
                this.lastedIt= naics;
            
            
 /***************************************************************
  *      Enable to                                              *
  *      Print Values for Debugging                             *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/   
            
        }
        
        
 /***************************************************************
  *                                                             *
  *      Setter Methods                                         *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/        
        
 public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCountyNumber(String countyNumber) {
        this.countyNumber = countyNumber;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFaxNo(String FaxNo) {
        this.FaxNo = FaxNo;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFein(String fein) {
        this.fein = fein;
    }

    public void setStn(String stn) {
        this.stn = stn;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public void setLastedIt(String lastedIt) {
        this.lastedIt = lastedIt;
    }

    public void setActive(boolean active) {
        this.active = active;
    }       
              
        
 /***************************************************************
  *                                                             *
  *      Getter Methods                                         *                        
  *                                                             * 
  *                                                             *
  ***************************************************************/   
        
    public String getFirstName() {
        return this.compName.get();
    }
    
    public String getClientId() 
    {
        return clientId;
    }

    public String getCompanyName() 
    {
        return CompanyName;
    }

    public String getAddr1() 
    {
        return addr1;
    }

    public String getAddr2() 
    {
        return addr2;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;
    }

    public String getZip() 
    {
        return zip;
    }

    public String getCountyName() 
    {
        return countyName;
    }

    public String getCountyNumber() 
    {
        return countyNumber;
    }

    public String getPhoneNo() 
    {
        return phoneNo;
    }

    public String getExtension() 
    {
        return extension;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getFaxNo() 
    {
        return FaxNo;
    }

    public String getContact() 
    {
        return contact;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getFein() 
    {
        return fein;
    }

    public String getStn() 
    {
        return stn;
    }

    public String getStateId() 
    {
        return stateId;
    }

    public String getNaics() 
    {
        return naics;
    }

    public String getLastedIt() 
    {
        return lastedIt;
    }

    public void addAssetToList(Assets asset){
        
        this.assets.add(asset);
    }
    
    public void onlyShowAssetsForYear(String year){
        //checks year for each asset and creates a new asset list with assets for desired year
        Assets tempAsset;
        ArrayList <Assets> newList= new ArrayList();
        for(int i=0; i<this.assets.size(); i++){
            
            tempAsset=this.assets.get(i);
            if(tempAsset.getReturnYear().equalsIgnoreCase(year)){
                newList.add(tempAsset);
            }
        }
        this.assets=newList;
    }
    
    public boolean isActive()
    {
        return active;
    }
            
    
 /***************************************************************
  *                                                             *
  *      Applied Data manipulation                              *                        
  *               Will go here                                  * 
  *                                                             *
  ***************************************************************/       
        
        
}

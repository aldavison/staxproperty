/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrewrite;

/**
 *
 * @author helpdesk
 */
public class CurrentYear {
    
    private int year;
  
    private Assets assets;
    
    private Client client;
    
    private Counties county;
    
    private PropertyReturn pReturn;
    
    private DBHelper dbHelper;
    
    public CurrentYear(){
        
    }
    
    public int getYear() {
        return year;
    }

    public Assets getAssets() {
        return assets;
    }

    public Client getClient() {
        return client;
    }

    public Counties getCounty() {
        return county;
    }

    public PropertyReturn getpReturn() {
        return pReturn;
    }

    public DBHelper getDbHelper() {
        return dbHelper;
    }
    
    public boolean loadInfoFromYear(int year){
        
        
        return false;
    }
    
    
    
}

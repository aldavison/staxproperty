/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrewrite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author helpdesk
 */
public class DBHelper {

  /**
   * ************************************************************
   * *
   * Client's Table Variables                               *
   * *
   * *
   * *************************************************************
   */


  private ResultSet rs;

  private Client Client;

  private ArrayList<Client> clientList;

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

  private String returnYear;

  private int assetID;
  private String description;
  private java.sql.Date acquiredDate;
  private double cost;
  private String category;
  private boolean disposed;
  private java.sql.Date disposedDate;
  private String disposedMethod;


  private Connection CONN;

  private Statement dbStatement;

  /**
   * ************************************************************
   * *
   * Connection                                             *
   * *
   * *
   * *************************************************************
   */
  public DBHelper() throws Exception {   //Establishes Connection to database
    // Depending on how the database is executed, you will use a different JDBC connection URL for accessing it:
    Class.forName( "org.hsqldb.jdbcDriver" ).newInstance();
//    this.CONN = DriverManager.getConnection( "jdbc:h2:~/test", "sa", "" );
//    this.CONN = DriverManager.getConnection( "jdbc:h2:tcp://localhost/~/test", "sa", "" );
//    this.CONN = DriverManager.getConnection( "jdbc:h2:mem:test", "sa", "" );
    this.CONN = DriverManager.getConnection( "jdbc:hsqldb:mem:test", "sa", "" );
    this.dbStatement = CONN.createStatement();
    checkTables();
  }


  //massive write


  public int writeAssets() {
    try {
      //writes data to database
      this.dbStatement.executeQuery( "" );
    } catch ( Exception ex ) {
      System.out.print( ex.getMessage() + "at :" + ex.getStackTrace() );
    }
    return -1;
  }

  public int writeClient( Client clientObj, String clientId, String companyName, String addr1,
                          String addr2, String city, String state, String zip,
                          String countyName, String countyNumber, String phoneNo,
                          String extension, String email, String faxNo, String contact,
                          String title, String fein, String stn, String stateId, String naics,
                          String lastedIt, boolean active )

  {  //this prob should call the other write methods
    try {
      //writes data to database
      this.dbStatement.execute( "INSERT INTO CLIENT VALUES(" + clientObj + ",\'" + clientId + "\',\'" + companyName + "\',\'"
              + addr1 + "\',\'" + addr2 + "\',\'" + city + "\',\'" + state + "\',\'" + zip + "\',\'" + countyName + "\',\'" + countyNumber + "\',\'"
              + phoneNo + "\',\'" + extension + "\',\'" + email + "\',\'" + faxNo + "\',\'" + contact + "\',\'" + title + "\',\'" + fein + "\',\'"
              + stn + "\',\'" + stateId + "\',\'" + naics + "\',\'" + lastedIt + "\'," + active + " )" );
    } catch ( Exception ex ) {
      System.out.print( ex.getMessage() + "at :" + ex.getStackTrace() );
    }
    return -1;
  }

  public int writePropertyReturn( boolean returnCompleated, String accoutNo, String mapParcelID, String physicalAddr1,
                                  String physicalAddr2, String physicalCity, String physicalState, String correctedName, String correctedAddr1,
                                  String correctedAddr2, String correctedCity, String correctedState, String correctedZip, String buisnessType,
                                  String stateIncTaxType, String fiscalYearEnd, String dBA, String licenseName, String preparerName,
                                  String preparerAddress, String preparerPhoneNo, String preparerPhoneExt, String supportingRecords,
                                  String productDesc, String sqFeetBuilding, String sqFeetRetail, String newOwnerInfo, String businessBegan,
                                  boolean preYearFiled, boolean assetsOtherLoccation, boolean ownBoat, boolean ownAircraft, String signatoryName,
                                  String signatoryTitle, String signatoryPhone, Date lastEdit ) {


    try {
      //writes data to database
      this.dbStatement.execute( "INSERT INTO PROPERTYRETURN VALUES(" + returnCompleated + "," + accoutNo + "," + mapParcelID + "," + physicalAddr1 + ","
              + physicalAddr2 + "," + physicalCity + "," + physicalState + "," + correctedName + "," + correctedAddr1 + "," +
              correctedAddr2 + "," + correctedCity + "," + correctedState + "," + correctedZip + "," + buisnessType + "," +
              "," + stateIncTaxType + "," + fiscalYearEnd + "," + dBA + "," + licenseName + "," + preparerName + "," +
              preparerAddress + "," + preparerPhoneNo + "," + preparerPhoneExt + "," + supportingRecords
              + "," + productDesc + "," + sqFeetBuilding + "," + sqFeetRetail + "," + newOwnerInfo + "," + businessBegan + ","
              + preYearFiled + "," + assetsOtherLoccation + "," + ownBoat + "," + ownAircraft + "," + signatoryName + "," +
              signatoryTitle + "," + signatoryPhone + "," + lastEdit + ")" );
    } catch ( Exception ex ) {
      System.out.print( ex.getMessage() + "at :" + ex.getStackTrace() );
    }
    return -1;
  }


  /**
   * ************************************************************************
   * Construct an empty table from the raw string specifications.
   *
   * @param name       the name of the relation
   * @param attributes the string containing attributes names
   * @param domains    the string containing attribute domains (data types)
   */

  public int loadAllClients() {
    try {
      this.rs = this.dbStatement.executeQuery( "SELECT * FROM CLIENTS" );

      while ( this.rs.next() ) {

        //adds client obj to arrayList
        this.clientList.add( (Client) this.rs.getObject( "ClientObj" ) );


      }
      return 1;
    } catch ( SQLException ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
      return -1;
    }

  }


  public int loadAssetsByClientIDAndYear( String client_ID, int year ) {   //*******problem, we will need for assets to be returned as objects saved by year
    try {

      //Client aspeact
      this.dbStatement.executeQuery( "SELECT * Assets WHERE COMPANY_NAME=" + client_ID + " And 'Year'=" + year );
      this.rs = dbStatement.getResultSet();
      this.clientId = this.rs.getString( "CLIENT_ID" );
      this.returnYear = this.rs.getString( "Return_Year" );
      this.countyNumber = this.rs.getString( "COUNTY_NUMBER" );
      this.assetID = Integer.parseInt( this.rs.getString( "AssetID" ) );
      this.description = this.rs.getString( "Description" );
      this.category = this.rs.getString( "Category" );
      this.disposedDate = (java.sql.Date) new SimpleDateFormat( "MMMM d, yyyy", Locale.ENGLISH ).parse( this.rs.getString( "DisposedDate" ) );
      this.disposedMethod = this.rs.getString( "DisposedMethod" );
      this.acquiredDate = (java.sql.Date) new SimpleDateFormat( "MMMM d, yyyy", Locale.ENGLISH ).parse( this.rs.getString( "AcquiredDate" ) );

      //

    } catch ( Exception ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
    }


    return -1;
  }

  public int laodPropertyReturn() {

    return -1;
  }

  public int loadClientByName( String name ) {
    try {
      this.dbStatement.executeQuery( "SELECT * FROM 'Client' WHERE 'COMPANY_NAME'= " + name );
      this.rs = this.dbStatement.getResultSet();

      this.clientId = this.rs.getString( "clientId" );
      this.CompanyName = this.rs.getString( "CompanyName" );
      this.addr1 = this.rs.getString( "addr1" );
      this.addr2 = this.rs.getString( "addr2" );
      this.city = this.rs.getString( "city" );
      this.state = this.rs.getString( "state" );
      this.zip = this.rs.getString( "zip" );
      this.countyName = rs.getString( "countyName" );
      this.countyNumber = rs.getString( "countyNumber" );
      this.phoneNo = rs.getString( "phoneNo" );
      this.extension = rs.getString( "extension" );
      this.email = rs.getString( "email" );
      this.FaxNo = rs.getString( "FaxNo" );
      this.contact = rs.getString( "contact" );
      this.title = rs.getString( "title" );
      this.fein = rs.getString( "fein" );
      this.stn = rs.getString( "stn" );
      this.stateId = rs.getString( "stateId" );
      this.naics = rs.getString( "naics" );
      this.lastedIt = rs.getString( "lastedIt" );
      this.active = Boolean.valueOf( rs.getString( "active" ) );
    } catch ( SQLException ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
    }

    this.Client = new Client( this.clientId, this.CompanyName, this.addr1, this.addr2, this.city,
            this.state, this.zip, this.countyName, this.countyNumber, this.phoneNo, this.extension,
            this.email, this.FaxNo, this.contact, this.title, this.fein, this.stn, this.stateId,
            this.naics, this.lastedIt, this.active );


    return -1;
  }

  private int checkTables() {
    //checks to see if the tables exsist, if not it creates the tables

    try {
      this.rs = this.dbStatement.executeQuery( "SELECT  * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='Clients'" );

      if ( rs.getRow() == 0 ) {
        //create tableString clientId, String companyName, String addr1,
            
                 /*
                  String clientId, String companyName, String addr1,
                      String addr2, String city, String state, String zip, 
                      String countyName, String countyNumber, String phoneNo,
                      String extension, String email, String faxNo, String contact, 
                      String title, String fein, String stn, String stateId, String naics,
                      String lastedIt, boolean active)
                      */
        this.rs = this.dbStatement.executeQuery( "CREATE TABLE Clients(ID INT PRIMARY KEY, CompanyName VARCHAR(255), "
                + "addr1 VARCHAR(255),addr2 VARCHAR(255),city VARCHAR(255), state VARCHAR(255),zip VARCHAR (10),countyName VARCHAR(255)"
                + ",countyNumber VARCHAR(255), phoneNo VARCHAR(255), extension VARCHAR(255), email VARCHAR(255), faxNo VARCHAR(255), "
                + "contact VARCHAR(255), title VARCHAR(255), fein VARCHAR(255), stn VARCHAR(255), stateId VARCHAR(255), naics VARCHAR(255)"
                + ",lastedIt VARCHAR(255), active BOOLEAN(1), clientObj OBJECT ) " );
      }
      this.rs = this.dbStatement.executeQuery( "SELECT  * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='Assets'" );
      if ( rs.getRow() == 0 ) {
        //create table
        this.rs = this.dbStatement.executeQuery( "CREATE TABLE Clients(ID INT PRIMARY KEY, NAME VARCHAR(255)),..." );
      }

      this.rs = this.dbStatement.executeQuery( "SELECT  * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='Counties'" );
      if ( rs.getRow() == 0 ) {
        //create table
        this.rs = this.dbStatement.executeQuery( "CREATE TABLE Counties(ID INT PRIMARY KEY, NAME VARCHAR(255)),..." );
      }

      this.rs = this.dbStatement.executeQuery( "SELECT  * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='CountyRate'" );
      if ( rs.getRow() == 0 ) {
        //create table
        this.rs = this.dbStatement.executeQuery( "CREATE TABLE CountyRate(ID INT PRIMARY KEY, NAME VARCHAR(255)),..." );
      }

      this.rs = this.dbStatement.executeQuery( "SELECT  * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME ='PropertyReturn'" );
      if ( rs.getRow() == 0 ) {
        //create table
        this.rs = this.dbStatement.executeQuery( "CREATE PropertyReturn Clients(ID INT PRIMARY KEY, NAME VARCHAR(255)),..." );
      }

    } catch ( SQLException ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
    }


    return -1;
  }


  public int loadClientByClientNo( String clientNo ) {


    try {
      this.dbStatement.executeQuery( "SELECT * FROM 'Client' WHERE 'ClientNo'= " + clientNo );

      this.rs = this.dbStatement.getResultSet();

      //this.clientId=this.rs.getString("clientId");
      this.CompanyName = this.rs.getString( "CompanyName" );
      this.addr1 = this.rs.getString( "addr1" );
      this.addr2 = this.rs.getString( "addr2" );
      this.city = this.rs.getString( "city" );
      this.state = this.rs.getString( "state" );
      this.zip = this.rs.getString( "zip" );
      this.countyName = rs.getString( "countyName" );
      this.countyNumber = rs.getString( "countyNumber" );
      this.phoneNo = rs.getString( "phoneNo" );
      this.extension = rs.getString( "extension" );
      this.email = rs.getString( "email" );
      this.FaxNo = rs.getString( "FaxNo" );
      this.contact = rs.getString( "contact" );
      this.title = rs.getString( "title" );
      this.fein = rs.getString( "fein" );
      this.stn = rs.getString( "stn" );
      this.stateId = rs.getString( "stateId" );
      this.naics = rs.getString( "naics" );
      this.lastedIt = rs.getString( "lastedIt" );
      this.active = Boolean.valueOf( rs.getString( "active" ) );
    } catch ( SQLException ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
    }

    this.Client = new Client( this.clientId, this.CompanyName, this.addr1, this.addr2, this.city,
            this.state, this.zip, this.countyName, this.countyNumber, this.phoneNo, this.extension,
            this.email, this.FaxNo, this.contact, this.title, this.fein, this.stn, this.stateId,
            this.naics, this.lastedIt, this.active );
    return -1;
  }


  public int loadClientObjectByClientNo( String clientNo ) {
    try {
      this.rs = this.dbStatement.executeQuery( "SELECT object FROM 'Client' WHERE 'ClientNo'= " + clientNo );

      while ( this.rs.next() ) {

        this.clientList.add( (Client) this.rs.getObject( "object" ) );

      }


      return 1;
    } catch ( SQLException ex ) {
      Logger.getLogger( DBHelper.class.getName() ).log( Level.SEVERE, null, ex );
    }
    return -1;
  }

  public ArrayList getClientArrayList() {

    return this.clientList;
  }


}

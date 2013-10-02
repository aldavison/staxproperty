/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrewrite;

import java.sql.Date;

/**
 *
 * @author helpdesk
 */
public class PropertyReturn extends Client{
        
    private boolean returnCompleated;
    
    private String accoutNo;
    
    private String mapParcelID;
    
    private String physicalAddr1;
    
    private String physicalAddr2;
    
    private String physicalCity;
    
    private String physicalState;
    
    private String correctedName;
    
    private String correctedAddr1;
    
    private String correctedAddr2;
    
    private String correctedCity;
    
    private String correctedState;
            
    private String correctedZip;
    
    private String buisnessType;
    
    private String stateIncTaxType;
    
    private String fiscalYearEnd;
    
    private String dBA;
    
    private String licenseName;
    
    private String preparerName;
    
    private String preparerAddress;
    
    private String preparerPhoneNo;
    
    private String preparerPhoneExt;
    
    private String supportingRecords;
            
    private String productDesc;
    
    private String sqFeetBuilding;
    
    private String sqFeetRetail;
    
    private String newOwnerInfo;
    
    private String businessBegan;
    
    private boolean preYearFiled;
    
    private boolean assetsOtherLoccation;
    
    private boolean ownBoat;
    
    private boolean ownAircraft;
    
    private String signatoryName;
    
    private String signatoryTitle;
    
    private String signatoryPhone;
    
    private Date lastEdit;

    public PropertyReturn(boolean returnCompleated, String accoutNo, String mapParcelID, String physicalAddr1, String physicalAddr2, String physicalCity, String physicalState, String correctedName, String correctedAddr1, String correctedAddr2, String correctedCity, String correctedState, String correctedZip, String buisnessType, String stateIncTaxType, String fiscalYearEnd, String dBA, String licenseName, String preparerName, String preparerAddress, String preparerPhoneNo, String preparerPhoneExt, String supportingRecords, String productDesc, String sqFeetBuilding, String sqFeetRetail, String newOwnerInfo, String businessBegan, boolean preYearFiled, boolean assetsOtherLoccation, boolean ownBoat, boolean ownAircraft, String signatoryName, String signatoryTitle, String signatoryPhone, Date lastEdit, String clientId, String companyName, String addr1, String addr2, String city, String state, String zip, String countyName, String countyNumber, String phoneNo, String extension, String email, String faxNo, String contact, String title, String fein, String stn, String stateId, String naics, String lastedIt, boolean active) {
        super(clientId, companyName, addr1, addr2, city, state, zip, countyName, countyNumber, phoneNo, extension, email, faxNo, contact, title, fein, stn, stateId, naics, lastedIt, active);
        this.returnCompleated = returnCompleated;
        this.accoutNo = accoutNo;
        this.mapParcelID = mapParcelID;
        this.physicalAddr1 = physicalAddr1;
        this.physicalAddr2 = physicalAddr2;
        this.physicalCity = physicalCity;
        this.physicalState = physicalState;
        this.correctedName = correctedName;
        this.correctedAddr1 = correctedAddr1;
        this.correctedAddr2 = correctedAddr2;
        this.correctedCity = correctedCity;
        this.correctedState = correctedState;
        this.correctedZip = correctedZip;
        this.buisnessType = buisnessType;
        this.stateIncTaxType = stateIncTaxType;
        this.fiscalYearEnd = fiscalYearEnd;
        this.dBA = dBA;
        this.licenseName = licenseName;
        this.preparerName = preparerName;
        this.preparerAddress = preparerAddress;
        this.preparerPhoneNo = preparerPhoneNo;
        this.preparerPhoneExt = preparerPhoneExt;
        this.supportingRecords = supportingRecords;
        this.productDesc = productDesc;
        this.sqFeetBuilding = sqFeetBuilding;
        this.sqFeetRetail = sqFeetRetail;
        this.newOwnerInfo = newOwnerInfo;
        this.businessBegan = businessBegan;
        this.preYearFiled = preYearFiled;
        this.assetsOtherLoccation = assetsOtherLoccation;
        this.ownBoat = ownBoat;
        this.ownAircraft = ownAircraft;
        this.signatoryName = signatoryName;
        this.signatoryTitle = signatoryTitle;
        this.signatoryPhone = signatoryPhone;
        this.lastEdit = lastEdit;
    }

    

    

    
    
    
    
}

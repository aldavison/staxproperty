/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package staxrewrite;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import taxrewrite.Assets;
import taxrewrite.Client;
import taxrewrite.DBHelper;

//get row data


/**
 * @author helpdesk
 */
public class TaxRewriteController implements Initializable {

  @FXML
  private Button saveAssetButton;

  @FXML
  private Label label;

  @FXML

  private TableView clientTable;
  @FXML
  private TableColumn clientList;

  @FXML
  private TableView clientInfoTable;
  @FXML
  private TableColumn countyName;

  @FXML
  private TableColumn clientName;

  @FXML
  private TableColumn lastReportYear;

  @FXML
  private TableColumn email;

  @FXML
  private TableColumn zip;

  @FXML
  private TableColumn clientNo;

  @FXML
  private TableColumn companyName;

  @FXML
  private TableColumn county;

  @FXML
  private Tab addClient;

  @FXML
  private Label messageBar;

  @FXML
  private TextField inputCompanyName;

  @FXML
  private TextField inputAddrLine1;
  @FXML
  private TextField inputAddrLine2;
  @FXML
  private TextField inputCity;
  @FXML
  private TextField inputState;
  @FXML
  private TextField inputZipCode;
  @FXML
  private TextField inputTelephoneNo;

  @FXML
  private Button saveClientButton;

  @FXML
  private Tab addEditAssets;


  @FXML
  private TableView assetsTable;

  @FXML
  private TableColumn assetReturnYear;

  @FXML
  private TableColumn assetTitle;

  @FXML
  private TableColumn assetId;

  private DBHelper dbHelper;

  private Client client;

  private Assets newAsset;


  @FXML
  public void populateClientList( ActionEvent event ) {


  }

  @FXML
  public void populateAssetsList( ActionEvent event ) {

  }

  @FXML
  public void addNewClient( ActionEvent event ) {


    populateClientList( event );
  }

  @FXML
  public void addNewAsset( ActionEvent event ) {


  }

  @FXML
  public void handleButtonAction( ActionEvent event ) {
    System.out.println( "You clicked me!" );
    label.setText( "Hello World!" );

  }


  @Override
  public void initialize( URL url, ResourceBundle rb ) {
    // TODO
    try {
      this.dbHelper = new DBHelper();
    } catch ( Exception e ) {
      throw new RuntimeException( e );
    }

    if ( this.dbHelper.loadAllClients() != 1 ) {
      System.out.println( "houston we have a problem" );
    }
  }
}

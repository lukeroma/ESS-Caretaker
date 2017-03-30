/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 
 */
public class FXMLDocumentController implements Initializable {
   
    // Objects from login screen (FXMLLogin.fxml)
    @FXML
    private Label lblMessage;
    @FXML 
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtUserName;
    
    // Objects from Home screen (FXMLHomePage.fxml)
    @FXML
    private Label header;
    
    @FXML
    private Button btnForward;
    
    @FXML
    private Button btnForward1;
    
    @FXML
    private Button btnValuation;
     
    // Objects from Properties Screen (FXMlProperties.fxml)
    @FXML
    private Button btnBack;
    
    // Objects from Valuation Screen (FXMlValuation.fxml
    @FXML
    private Button btnback;
    
    // Objects from **** Screen (FXMl****.fxml
    
    // Objects from **** Screen (FXMl****.fxml
    
    // Objects from **** Screen (FXMl****.fxml
    
    // Objects from **** Screen (FXMl****.fxml
    
    //Used to change scenes
     @FXML
    private void changeSceneAction(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    if(event.getSource()==btnForward){
        
        stage=(Stage) btnForward.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLTest.fxml"));
        
    }else if (event.getSource()==btnForward1) {
		stage=(Stage) btnForward1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLProperties.fxml"));
    }else if (event.getSource()==btnValuation) {
		stage=(Stage) btnValuation.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLValuation.fxml"));     
    // add new else if like above to link to and from new pages
    
    }else{
        stage=(Stage) btnBack.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        
    }
    Scene scene = new Scene(root);
    scene.getStylesheets().add("cms/styles.css");
    stage.setScene(scene);
    stage.show();
    }
    
    //Login in method
    @FXML
    private void btnLoginAction(ActionEvent event) throws Exception {
        if (txtUserName.getText().equals("test") && txtPassword.getText().equals("test")) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            
            Parent mainParent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
            Scene mainScene = new Scene(mainParent);
            mainScene.getStylesheets().add("cms/styles.css");
            Stage mainStage = new Stage(); 
            mainStage.setScene(mainScene);
            mainStage.show();
        }else {
            lblMessage.setText("Username: test and Password: test");
        }
    
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLInfoController implements Initializable {
    
    @FXML
    private Label lbl1;
    //lbl2,lbl3;
    
    @FXML
    private Button ieeeBtn,HomeBtn, majorBtn, minorBtn, mastersBtn, phdBtn;
    //,btn3,btn4;
    
    @FXML
    private void handleInfoBtnAction (ActionEvent event) throws Exception {
        Stage stage;
        
        Parent root;
       
        if (event.getSource() == ieeeBtn){
            stage = (Stage) ieeeBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/IEEE.fxml"));
        }
        else if (event.getSource() == majorBtn){
            stage = (Stage) majorBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/major.fxml"));
        }
        else if (event.getSource() == minorBtn){
            stage = (Stage) minorBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/minor.fxml"));
        }
        else if (event.getSource() == mastersBtn){
            stage = (Stage) mastersBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/masters.fxml"));
        }
        else if (event.getSource() == phdBtn){
            stage = (Stage) phdBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/PhD.fxml"));
        }
        
        else {
            stage = (Stage) HomeBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/FXMLDocument.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
        stage.setFullScreen(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}

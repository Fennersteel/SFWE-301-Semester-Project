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
    private Button discordBtn,onetBtn,statsBtn,handshakeBtn,advisingBtn,thinkTankBtn,saltCenterBtn,drcBtn,scholarshipBtn,informsBtn,ieeeBtn,HomeBtn, majorBtn, minorBtn, mastersBtn, phdBtn,iiseBtn,sewBtn,eaBtn;
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
        else if (event.getSource() == iiseBtn){
            stage = (Stage) iiseBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/IISE.fxml"));
        }
        else if (event.getSource() == sewBtn){
            stage = (Stage) sewBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/SEWC.fxml"));
        }
        else if (event.getSource() == eaBtn){
            stage = (Stage) eaBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/ENGRAmbassadors.fxml"));
        }
        else if (event.getSource() == informsBtn){
            stage = (Stage) informsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Informs.fxml"));
        }
        else if (event.getSource() == thinkTankBtn){
            stage = (Stage) thinkTankBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/THINKTANK.fxml"));
        }
        else if (event.getSource() == saltCenterBtn){
            stage = (Stage) saltCenterBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/salt.fxml"));
        }
        else if (event.getSource() == drcBtn){
            stage = (Stage) drcBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/DRC.fxml"));
        }
        else if (event.getSource() == scholarshipBtn){
            stage = (Stage) scholarshipBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Scholarships.fxml"));
        }
        else if (event.getSource() == advisingBtn){
            stage = (Stage) advisingBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/advising.fxml"));
        }
        else if (event.getSource() == discordBtn){
            stage = (Stage) discordBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Discord.fxml"));
        }
        else if (event.getSource() == onetBtn){
            stage = (Stage) onetBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/ONet.fxml"));
        }
        else if (event.getSource() == statsBtn){
            stage = (Stage) statsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/stats.fxml"));
        }
        else if (event.getSource() == handshakeBtn){
            stage = (Stage) handshakeBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Handshake.fxml"));
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

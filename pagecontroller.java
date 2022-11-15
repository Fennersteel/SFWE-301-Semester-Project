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

public class pagecontroller implements Initializable {
    
    @FXML
    private Label lbl1;
    //lbl2,lbl3;
    
    @FXML
    private Button HomeBtn, advisingBackBtn, discordBackBtn, drcBackBtn, engrambBackBtn, handshakeBackBtn, ieeeBackBtn, iiseBackBtn, informsBackBtn, majorBackBtn, minorBackBtn, mastersBackBtn, onetBackBtn, phdBackBtn, saltBackBtn, scholarshipsBackBtn, sewcBackBtn, statsBackBtn, thinktankBackBtn;
    //,btn3,btn4;
    
    @FXML
    private void handleBackButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        
        Parent root;
       
        if(event.getSource() == majorBackBtn){
            //stage.setFullScreen(true);
            stage = (Stage) majorBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/UnderGrad.fxml"));
        }
        else if (event.getSource() == minorBackBtn){
            stage = (Stage) minorBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/UnderGrad.fxml"));
        }
        else if (event.getSource() == mastersBackBtn){
            stage = (Stage) mastersBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/GraduateProgram.fxml"));
        }
        else if (event.getSource() == phdBackBtn){
            stage = (Stage) phdBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/GraduateProgram.fxml"));
        }
        else if (event.getSource() == sewcBackBtn){
            stage = (Stage) sewcBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == engrambBackBtn){
            stage = (Stage) engrambBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == ieeeBackBtn){
            stage = (Stage) ieeeBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == iiseBackBtn){
            stage = (Stage) iiseBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == informsBackBtn){
            stage = (Stage) informsBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == thinktankBackBtn){
            stage = (Stage) thinktankBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == saltBackBtn){
            stage = (Stage) saltBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == drcBackBtn){
            stage = (Stage) drcBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == scholarshipsBackBtn){
            stage = (Stage) scholarshipsBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == advisingBackBtn){
            stage = (Stage) advisingBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == discordBackBtn){
            stage = (Stage) discordBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
        }
        else if (event.getSource() == onetBackBtn){
            stage = (Stage) onetBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
        }
        else if (event.getSource() == statsBackBtn){
            stage = (Stage) statsBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
        }
        else if (event.getSource() == handshakeBackBtn){
            stage = (Stage) handshakeBackBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
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


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

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lbl1;
    //lbl2,lbl3;
    
    @FXML
    private Button ClubBtn,CareersBtn,AcademicsBtn,HomeBtn,WebsiteBtn,UnderGradBtn,GraduateBtn,ieeeBtn;
    //,btn3,btn4;
    
    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        
        Parent root;
       
        if(event.getSource()==ClubBtn){
            //stage.setFullScreen(true);
            stage = (Stage) ClubBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
        }
        else if (event.getSource() == AcademicsBtn){
            stage = (Stage) AcademicsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
        }
        else if (event.getSource() == CareersBtn){
            stage = (Stage) CareersBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
        }
        else if (event.getSource() == WebsiteBtn){
            stage = (Stage) WebsiteBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Website.fxml"));
        }
        else if (event.getSource() == UnderGradBtn){
            stage = (Stage) UnderGradBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/UnderGrad.fxml"));
        }
        else if (event.getSource() == GraduateBtn){
            stage = (Stage) GraduateBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/GraduateProgram.fxml"));
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


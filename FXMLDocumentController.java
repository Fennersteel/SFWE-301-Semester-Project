
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
    
    @FXML//buttons used in scene
    private Button ClubBtn,CareersBtn,AcademicsBtn,HomeBtn,WebsiteBtn,UnderGradBtn,GraduateBtn,ieeeBtn;
    
    
    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        
        Parent root;
        //following if else, changes screens from home screen and tracks amount of visits to each page and prints to terminal
        if(event.getSource()==ClubBtn){
            stage = (Stage) ClubBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Clubs.fxml"));
            ++App.clubCnt;
            System.out.println("Clubs page visits: " + App.clubCnt);
        }
        else if (event.getSource() == AcademicsBtn){
            stage = (Stage) AcademicsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Academics.fxml"));
            ++App.academicsCnt;
            System.out.println("Academics page visits: " + App.academicsCnt);
        }
        else if (event.getSource() == CareersBtn){
            stage = (Stage) CareersBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Careers.fxml"));
            ++App.careerCnt;
            System.out.println("Careers page visits: " + App.careerCnt);
        }
        else if (event.getSource() == WebsiteBtn){
            stage = (Stage) WebsiteBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Website.fxml"));
            ++App.sweWebsiteCnt;
            System.out.println("Software Engineering website visits: " + App.sweWebsiteCnt);
        }
        else if (event.getSource() == UnderGradBtn){
            stage = (Stage) UnderGradBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/UnderGrad.fxml"));
            ++App.underGradCnt;
            System.out.println("Undergraduate Information visits: " + App.underGradCnt);
        }
        else if (event.getSource() == GraduateBtn){
            stage = (Stage) GraduateBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/GraduateProgram.fxml"));
            ++App.graduateCnt;
            System.out.println("Graduate Information visits: " + App.graduateCnt);
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
   
    
    //needed to run
    public void initialize(URL url, ResourceBundle rb) {
        
    }       
}


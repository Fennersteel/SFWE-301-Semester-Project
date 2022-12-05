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
            ++App.ieeeCnt;
            System.out.println("IEEE visits: " + App.ieeeCnt);
        }
        else if (event.getSource() == majorBtn){
            stage = (Stage) majorBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/major.fxml"));
            ++App.majorCnt;
            System.out.println("Major visits: " + App.majorCnt);
        }
        else if (event.getSource() == minorBtn){
            stage = (Stage) minorBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/minor.fxml"));
            ++App.minorCnt;
            System.out.println("Minor visits: " + App.minorCnt);
        }
        else if (event.getSource() == mastersBtn){
            stage = (Stage) mastersBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/masters.fxml"));
            ++App.mastersCnt;
            System.out.println("Masters visits: " + App.mastersCnt);
        }
        else if (event.getSource() == phdBtn){
            stage = (Stage) phdBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/PhD.fxml"));
            ++App.phdCnt;
            System.out.println("PhD visits: " + App.phdCnt);
        }
        else if (event.getSource() == iiseBtn){
            stage = (Stage) iiseBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/IISE.fxml"));
            ++App.iiseCnt;
            System.out.println("IISE visits: " + App.iiseCnt);
        }
        else if (event.getSource() == sewBtn){
            stage = (Stage) sewBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/SEWC.fxml"));
            ++App.sewCnt;
            System.out.println("SEWC visits: " + App.sewCnt);
        }
        else if (event.getSource() == eaBtn){
            stage = (Stage) eaBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/ENGRAmbassadors.fxml"));
            ++App.eaCnt;
            System.out.println("Engineering Ambassadors visits: " + App.eaCnt);
        }
        else if (event.getSource() == informsBtn){
            stage = (Stage) informsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Informs.fxml"));
            ++App.informsCnt;
            System.out.println("Informs visits: " + App.informsCnt);
        }
        else if (event.getSource() == thinkTankBtn){
            stage = (Stage) thinkTankBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/THINKTANK.fxml"));
            ++App.thinkTankCnt;
            System.out.println("THINKTANK visits: " + App.thinkTankCnt);
        }
        else if (event.getSource() == saltCenterBtn){
            stage = (Stage) saltCenterBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/salt.fxml"));
            ++App.saltCenterCnt;
            System.out.println("SALT visits: " + App.saltCenterCnt);
        }
        else if (event.getSource() == drcBtn){
            stage = (Stage) drcBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/DRC.fxml"));
            ++App.drcCnt;
            System.out.println("DRC visits: " + App.drcCnt);
        }
        else if (event.getSource() == scholarshipBtn){
            stage = (Stage) scholarshipBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Scholarships.fxml"));
            ++App.scholarshipCnt;
            System.out.println("Scholarships visits: " + App.scholarshipCnt);
        }
        else if (event.getSource() == advisingBtn){
            stage = (Stage) advisingBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/advising.fxml"));
            ++App.advisingCnt;
            System.out.println("Advising visits: " + App.advisingCnt);
        }
        else if (event.getSource() == discordBtn){
            stage = (Stage) discordBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Discord.fxml"));
            ++App.discordCnt;
            System.out.println("Discord visits: " + App.discordCnt);
        }
        else if (event.getSource() == onetBtn){
            stage = (Stage) onetBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/ONet.fxml"));
            ++App.onetCnt;
            System.out.println("ONet visits: " + App.onetCnt);
        }
        else if (event.getSource() == statsBtn){
            stage = (Stage) statsBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/stats.fxml"));
            ++App.statsCnt;
            System.out.println("Stats visits: " + App.statsCnt);
        }
        else if (event.getSource() == handshakeBtn){
            stage = (Stage) handshakeBtn.getScene().getWindow();
            stage.setFullScreen(true);
            root = FXMLLoader.load(getClass().getResource(".fxml/Handshake.fxml"));
            ++App.handshakeCnt;
            System.out.println("Handshake visits: " + App.handshakeCnt);
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

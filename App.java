
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
     
   //below are public variables to count amount of visits to each page  
   public static int discordCnt,onetCnt,statsCnt,handshakeCnt,advisingCnt,thinkTankCnt,saltCenterCnt,drcCnt,scholarshipCnt,informsCnt,ieeeCnt,HomeCnt, majorCnt, minorCnt, mastersCnt, phdCnt,iiseCnt,sewCnt,eaCnt = 0;
   public static int underGradCnt,graduateCnt,sweWebsiteCnt,clubCnt,academicsCnt,careerCnt = 0;

   @Override
     public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(".fxml/FXMLDocument.fxml"));

        StackPane pane = new StackPane(root);
        Scene scene = new Scene(pane, 3840, 2160); //sets screen size
        
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setFullScreenExitHint(STYLESHEET_CASPIAN);
        stage.setScene(scene);
        stage.show();
     }
 
     public static void main(String[] args) {
        launch(args);//launches program
        
     }    
 }
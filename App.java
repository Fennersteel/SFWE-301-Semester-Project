
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
     
     @Override
     public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(".fxml/FXMLDocument.fxml"));
        
        StackPane pane = new StackPane(root);
        Scene scene = new Scene(pane, 800, 500);
        
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setFullScreenExitHint(STYLESHEET_CASPIAN);
        stage.setScene(scene);
        stage.show();
     }
 
     public static void main(String[] args) {
        launch(args);
     }    
 }

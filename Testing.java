import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;


public class Testing extends Application
{
    @Override
    public void start(Stage stage)
    {
        try
        {
            Button button1 = new Button();
            button1.setText("Button");
            button1.prefWidthProperty().bind(pane.widthProperty());
            button1.prefHeightProperty().bind(pane.heightProperty());

            Button button2 = new Button();
            button2.setText("Button");
            button2.prefWidthProperty().bind(pane.widthProperty());
            button2.prefHeightProperty().bind(pane.heightProperty());
            button2.setMaxHeight(200);

            grid.addRow(0, button1, button2);
            pane.getChildren().add(grid);

            
            stage.setScene(scene);
            stage.show();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    GridPane grid= new GridPane();
    StackPane pane = new StackPane();
    Scene scene = new Scene(pane, 100, 100);
    
    public static void main (String[] args)
    {
        launch(args);

    }
}
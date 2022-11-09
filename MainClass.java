import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainClass {
   public static void main(String[] args) {
      JFrame topFrame = null;        // Application window
      JTextField outputField = null; // Displays output salary

   

      // Create text field
      outputField = new JTextField();
      // Display program output using the text field
      outputField.setText("Hello Dr. Saldana :)");

      // Prevent user from editing output text
      outputField.setEditable(false);

      // Create window 
      topFrame = new JFrame("MainGUI");

      // Add text field to window
      topFrame.add(outputField);

      // Resize window to fit components 
      topFrame.pack();

      // Set program to terminate when window is closed
      topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display window
      topFrame.setVisible(true);
   }
}
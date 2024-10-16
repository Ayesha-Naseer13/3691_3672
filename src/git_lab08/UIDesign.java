package git_lab08;
import javax.swing.*;
import java.awt.*;

public class UIDesign {

    
    public void designUI() {
    	
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            // Modifying layout to make it more user-friendly 
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 1)); // Grid layout with 2 rows, 1 column
            // Adding new UI components 
            JLabel label = new JLabel("New Label: Enter details below");
            JTextField inputField = new JTextField(10);
            // Adding components to the panel
            panel.add(label);
            panel.add(inputField);
            panel.add(button1);
            panel.add(button2);
            JFrame frame = new JFrame("Member 2 UI Design");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setSize(400, 300);
            frame.setVisible(true);
    }
public static void main(String[] args) {
      
        UIDesign uiDesign = new UIDesign();
        uiDesign.designUI();
    }
}

package git_lab08;
import javax.swing.*;
import java.awt.*;

public class UIDesign {

    // Method to design the UI with Member 1's changes
    public void designUI() {
        // Original UI Setup
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Change button colors to green (Member 1's change)
        button1.setBackground(Color.GREEN);
        button2.setBackground(Color.GREEN);

        // Change font size for better visibility (Member 1's change)
        button1.setFont(new Font("Arial", Font.PLAIN, 18));
        button2.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add buttons to the panel
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        // Final setup
        JFrame frame = new JFrame("Member 1 UI Design");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the UIDesignMember1 class and invoke the designUI method
        UIDesign uiDesign = new UIDesign();
        uiDesign.designUI();
    }
}

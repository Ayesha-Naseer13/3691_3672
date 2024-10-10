package git_lab08;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Calculator {

	 // Method to perform addition
    public int addition(int a, int b) {
        return a + b;
    }

    // Method to perform multiplication
    public int multiplication(int a, int b) {
        return a * b;
    }
    public void designUI(JPanel panel, JButton button) {
        // Change button color to green (Member 1's design)
        button.setBackground(Color.GREEN);

        // Set font size for buttons (Member 1's design)
        button.setFont(new Font("Arial", Font.PLAIN, 16));
    }
}

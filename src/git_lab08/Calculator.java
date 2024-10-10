package git_lab08;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Calculator {

    // Method to perform addition with input validation
    public int addition(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
        return a + b;
    }

    // Method to perform multiplication with input validation
    public int multiplication(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
        return a * b;
    }

    public void designUI(JPanel panel, JButton button) {
    	// Rearrange buttons to a new layout
        panel.setLayout(new GridLayout(2, 2));
        
        // Add a new label and input field
        JLabel label = new JLabel("Enter Value:");
        JTextField inputField = new JTextField();
        panel.add(label);
        panel.add(inputField);
    }
}


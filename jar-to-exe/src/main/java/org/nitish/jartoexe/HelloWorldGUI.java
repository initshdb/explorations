package org.nitish.jartoexe;

import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Worlds Java Swing");

        // set frame site
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // center the JLabel
        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        lblText.setFont(new Font("Verdana", Font.PLAIN, 50));

        // add JLabel to JFrame
        frame.getContentPane().add(lblText);

        // display it
        frame.pack();
        frame.setVisible(true);
    }
}

import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {

        // Design part
        this.setSize(800, 800);
        this.getContentPane().setBackground(new Color(0xb0c4de));
        this.setTitle("Celsius & Fahrenheit Converter By Itayos");

        // Settings part
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Setting layout manager to null for manual component positioning
        this.setVisible(true);
    }
}

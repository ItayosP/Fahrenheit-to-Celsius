import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    JButton myButton1 = new JButton();
    JButton myButton2 = new JButton();

    MyFrame() {

        // Design part
        this.setSize(800, 800);
        this.getContentPane().setBackground(new Color(0xb0c4de));
        this.setTitle("Celsius & Fahrenheit Converter By Itayos");

        // Settings part
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        myButton1.addActionListener(this);
        myButton2.addActionListener(this);

        //button1
        myButton1.setBounds(463, 210, 75, 50);
        myButton1.setVisible(true); 
        
        //button2
        myButton2.setBounds(463, 500, 75, 50);
        myButton2.setVisible(true);

        this.add(myButton1);
        this.add(myButton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton1) {
            System.out.println("Button 1 clicked");
        } else if(e.getSource()==myButton2) {
            System.out.println("Button 2 clicked");
        }
    }
}

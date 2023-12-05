import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    public double ftocResult; // Variable to store ftoc result
    public double ctofResult; // Variable to store ctof result

    private static final ActionListener MyFrame = null;
    JButton myButton1 = new JButton();
    JButton myButton2 = new JButton();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();  

    MyFrame() {

        //text propmt
        text1.setSize(200, 50);
        text1.setVisible(true);
        text1.setLocation(250, 210);
        text1.addActionListener(MyFrame);

        //text prompt
        text3.setSize(200, 50);
        text3.setVisible(true);
        text3.setLocation(250, 500);
        text3.addActionListener(MyFrame);


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
        myButton1.setText("converte");
        
        //button2
        myButton2.setBounds(463, 500, 75, 50);
        myButton2.setVisible(true);
        myButton2.setText("converte");

        this.add(myButton1);
        this.add(myButton2);
        this.add(text1);
        this.add(text2);
        this.add(text3);
        this.add(text4);
    }

    public double getFtoCResult() {
        return ftocResult;
    }

    public double getCtoFResult() {
        return ctofResult;
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton1) {
            String fString = text1.getText();
            try {
                double f = Double.parseDouble(fString);
                double ftoc = (f - 32) * 5 / 9;
                ftocResult = ftoc;
                System.out.println(ftoc);
            } catch (NumberFormatException ex) {
                System.out.println("Input is not a valid double");
            }
        } else if (e.getSource() == myButton2) {
            String cString = text3.getText();
            try {
                double c = Double.parseDouble(cString);
                double ctof = c * (9.0 / 5.0) + 32;
                ctofResult = ctof;
                System.out.println(ctof);
            } catch (NumberFormatException ex) {
                System.out.println("Input is not a valid double");
            }
        }
    } 
}

//MyFrame == classA

//Menu == classB
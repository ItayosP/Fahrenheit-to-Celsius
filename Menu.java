import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        JPanel panel = new JPanel();
        MyLabel label = new MyLabel();
        MyLabel label2 = new MyLabel();
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        JTextField text4 = new JTextField();
        JButton MyButton = new JButton();

        //label
        label2.setText("Enter Celsius: ");
        label2.setBounds(50, 500, 200, 50);

        //text1
        text1.setSize(200, 50);
        text1.setVisible(true);
        text1.setLocation(250, 210);
        //text2
        text2.setSize(200, 50);
        text2.setVisible(true);
        text2.setLocation(550, 210);

        //text3
        text3.setSize(200, 50);
        text3.setVisible(true);
        text3.setLocation(250, 500);

        //text4
        text4.setSize(200, 50);
        text4.setVisible(true);
        text4.setLocation(550, 500);

        MyButton.setBounds(465, 210, 75, 50);
        MyButton.setVisible(true); 

        frame.add(panel);
        frame.add(label);
        frame.add(label2);
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(MyButton);

        frame.repaint();
    }
}

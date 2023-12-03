import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        MyLabel label = new MyLabel();
        MyLabel label2 = new MyLabel();
        MyLabel label3 = new MyLabel();
        MyLabel label4 = new MyLabel();

        label2.setText("Enter Celsius: ");
        label2.setBounds(50, 500, 200, 50);

        //label3
        label3.setText("hello");
        label3.setSize(200, 50);
        label3.setVisible(true);
        label3.setLocation(550, 210);

        //label4
        label4.setText("hello");
        label4.setSize(200, 50);
        label4.setVisible(true);
        label4.setLocation(550, 500);

        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.repaint();
    }
}

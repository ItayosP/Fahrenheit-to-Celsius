import java.awt.Font;
import javax.swing.*;

public class MyLabel extends JLabel {
    MyLabel() {

        this.setText("Enter Fahrenheit: ");
        this.setBounds(50, 200, 200, 50); // Adjust the position and size as needed
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
    }
}

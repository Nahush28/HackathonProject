package Package;
import java.awt.*;
import javax.swing.*;


public class YouWonPanel extends JPanel{

    JFrame frame;
    static JLabel label;

    YouWonPanel() {
        frame = new JFrame("Congratulations!");

        label = new JLabel("You Won!",JLabel.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 60));


        JPanel panel = new JPanel();

        panel.add(label);
        panel.setBackground(Color.GREEN);
        frame.add(panel);

        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setVisible(true);

        GamePanel.isRunning = false;



    }

}

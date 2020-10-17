package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class HelpMenu extends JPanel {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private static JFrame f;
    private static JPanel p;
    private static JLabel l;

    public HelpMenu() {
        f = new JFrame("Help");
        f.setVisible(true);
        f.setSize(WIDTH,HEIGHT);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        p.setBackground(Color.gray);

        l.setText("Hi! Welcome to our game.");
        l.setFont(new Font("Verdana",1,30));


    }


}

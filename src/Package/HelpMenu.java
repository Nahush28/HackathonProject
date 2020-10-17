package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import javax.swing.JPanel;


public class HelpMenu extends JPanel {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private static JFrame f;


    public HelpMenu() {
        f = new JFrame("Help Box");
        f.setVisible(true);
        f.setSize(WIDTH,HEIGHT);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setResizable(false);
        f.setBackground(Color.gray);

        JLabel label = new JLabel("Welcome to our game!", JLabel.CENTER);
        label.setAlignmentX(0);
        label.setAlignmentY(0);

        f.add(label);


    }



}

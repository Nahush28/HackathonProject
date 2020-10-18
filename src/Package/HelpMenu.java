package Package;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class HelpMenu extends JPanel {

    static JFrame f;



    // label to display text
    static JLabel l;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;

    static JLabel lAlexLiu;

    static JLabel lBradleyChang;

    static JLabel lMichaelCon;

    static JLabel lNahushChang;


    public HelpMenu() {

        // create a new frame to store text field and button
        f = new JFrame("Help Panel");

        // create a label to display text
        l = new JLabel("Welcome to our Game!");
        l.setFont(new Font("Serif", Font.PLAIN, 40));

        l1 = new JLabel("Our game consists of a series of jumping obstacles");
        l1.setFont(new Font("Serif", Font.PLAIN, 15));

        l2 = new JLabel("You jump with 'space bar' and move horizontally with 'A' and 'D'.");
        l2.setFont(new Font("Serif", Font.PLAIN, 15));

        l3 = new JLabel("Developers");
        l3.setFont(new Font("Serif", Font.PLAIN, 40));

        lAlexLiu = new JLabel("-Alex Liu-",JLabel.CENTER);
        lAlexLiu.setFont(new Font("Serif", Font.PLAIN, 15));
        lAlexLiu.setAlignmentX(0);
        lAlexLiu.setAlignmentY(10);

        lBradleyChang = new JLabel("-Bradley Chang-",JLabel.CENTER);
        lBradleyChang.setFont(new Font("Serif", Font.PLAIN, 15));
        lBradleyChang.setAlignmentX(0);
        lBradleyChang.setAlignmentY(0);

        lMichaelCon = new JLabel("-Michael Con-",JLabel.CENTER);
        lMichaelCon.setFont(new Font("Serif", Font.PLAIN, 15));
        lMichaelCon.setAlignmentX(0);
        lMichaelCon.setAlignmentY(-10);

        lNahushChang = new JLabel("-Nahush Chang-",JLabel.CENTER);
        lNahushChang.setFont(new Font("Serif", Font.PLAIN, 15));
        lNahushChang.setAlignmentX(0);
        lNahushChang.setAlignmentY(-20);

        // create a panel to add buttons
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(l);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(lAlexLiu);
        p.add(lBradleyChang);
        p.add(lMichaelCon);
        p.add(lNahushChang);

        // setbackground of panel
        p.setBackground(Color.GRAY);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(500, 500);
        f.setResizable(false);

        f.setVisible(true);

    }

}
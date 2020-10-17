package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable, KeyListener {
   private static final long serialVersionUID = 0;
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;

    private Thread thread;
    private boolean isRunning = false;
    
    private final int fps = 60;
    private final long targetTime  = 1000/fps;

    //the size of the game panel
    public GamePanel(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        start();
    }//GamePanel

    private void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }//start()

    public void run() {
        long start;
        long elapsed;
        long wait;

        while (isRunning) {
            start = System.nanoTime();
            tick();
            repaint();

            elapsed = System.nanoTime() - start;
            wait = targetTime - elapsed/1000000;

            //Makes sure that the game stays plays at the same pace regardless of computer power
            if(wait <= 0 ) {
                wait = 5;
            }

            try {
                Thread.sleep(wait);
            } catch(Exception e) {
                e.printStackTrace();
            }

        }//While
    } //run()

    public void tick() {

    } //tick()

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    } //paintComponent

    public void keyTyped(KeyEvent e) {

    } //invitations 

    public void keyPressed(KeyEvent e) {

    }//keyPressed

    public void keyReleased(KeyEvent e) {

    }//keyReleased
}
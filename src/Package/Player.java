package Package;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Rectangle {

    private static final long serialVersionIUD = 1L;
    private boolean right  = false;
    private boolean left = false;

    public Player(int width, int height) {
        setBounds(GamePanel.WIDTH/ 2, GamePanel.HEIGHT / 2, width, height);
    }

    public void tick() {
        if(right) {
            x++;
        }
        if(left) {
            x--;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x,y,width,height);
    }

    public void keyPressed(int k) {
        if(k == KeyEvent.VK_D) {
            right = true;
        }
        if(k == KeyEvent.VK_A) {
            left = true;
        }
    }

    public void keyReleased(int k) {
        if(k == KeyEvent.VK_D) {
            right = false;
        }
        if(k == KeyEvent.VK_A) {
            left = false;
        }
    }

}

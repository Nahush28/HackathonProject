package Package;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.cert.CollectionCertStoreParameters;
import java.util.IllegalFormatWidthException;

public class Player extends Rectangle {

    private static final long serialVersionIUD = 1L;

    //movement
    private boolean right  = false;
    private boolean left = false;
    private boolean jumping = false,falling = false;

    // Move speed
    private double moveSpeed = 2.5;
    //bounds
    private double x,y;
    private int width, height;

    //jump speed
    private double jumpSpeed = 5;
    private double currentJumpSpeed = jumpSpeed;

    //fall speed
    private double maxFallSpeed = 5;
    private double currentFallSpeed = 0.1;


    public Player(int width, int height) {
        x = GamePanel.WIDTH/2;
        y = GamePanel.HEIGHT/2;
        this.width = width;
        this.height = height;
    }

    public void tick(Block[] b) {
        int iX = (int)x;
        int iY = (int)y;

        for (int i = 0; i<b.length; i++){
            if(Collision.playerBlock(new Point(iX +width+ (int)GameState.xOffset,iY+(int)GameState.yOffset),b[i])|| Collision.playerBlock(new Point(iX+width+(int)GameState.xOffset, iY + height+(int)GameState.yOffset), b[i])) {
                right = false;
            }

            if (Collision.playerBlock(new Point(iX + (int)GameState.xOffset, iY + (int)GameState.yOffset), b[i])||Collision.playerBlock(new Point(iX + (int)GameState.xOffset, iY + height + (int)GameState.yOffset),b[i])) {
                left = false;
            }

            if (Collision.playerBlock(new Point(iX + (int)GameState.xOffset, iY + (int) GameState.yOffset), b[i])|| Collision.playerBlock(new Point(iX + width + (int) GameState.xOffset, iY + (int) GameState.yOffset),b[i])){
                jumping = false;
                falling = true;
            }

            if (Collision.playerBlock(new Point(iX + (int) GameState.xOffset, iY + height + (int) GameState.yOffset),b[i]) || Collision.playerBlock(new Point(iX + width + (int)GameState.xOffset, iY + height + (int) GameState.yOffset), b[i])){
                falling = false;
                break;
            } else {
                falling = true;
            }
        }

        if(right) {
            GameState.xOffset+=moveSpeed;
        }
        if(left) {
            GameState.xOffset-=moveSpeed;
        }
        if(jumping){
            GameState.yOffset -= currentJumpSpeed;
            currentJumpSpeed -= .1;

            if(currentJumpSpeed <= 0){
                currentJumpSpeed = jumpSpeed;
                jumping = false;
                falling = true;
            }
        }
        if(falling){
            GameState.yOffset += currentFallSpeed;

            if(currentFallSpeed < maxFallSpeed)
                currentFallSpeed +=.1;
        }

        if(!falling)
            currentFallSpeed = .1;

    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect((int)x,(int)y,width,height);
    }

    public void keyPressed(int k) {
        if(k == KeyEvent.VK_D) {
            right = true;
        }
        if(k == KeyEvent.VK_A) {
            left = true;
        }

        if(k == KeyEvent.VK_SPACE) jumping = true;
    }

    public void keyReleased(int k) {
        if(k == KeyEvent.VK_D) {
            right = false;
        }
        if(k == KeyEvent.VK_A) {
            left = false;
        }
        if (!falling) {
            currentFallSpeed = .1;
        }

    }

}

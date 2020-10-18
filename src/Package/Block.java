package Package;
import java.util.Random;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Block extends Rectangle{
    Random rand = new Random();
    private static final long serialVersionUID = 1L;

    public static final int blocksize = 50;

    private int id;

    public Block(int x, int y) {
        setBounds(x,y,blocksize,blocksize);
        //this.id = id;
    }

    public void tick() {

    }

    public void draw(Graphics g) {
            //g.drawRect(x-(int)GameState.xOffset, y-(int)GameState.yOffset, width, height);
            g.drawImage(Images.blocks[id], x-(int)GameState.xOffset, y-(int)GameState.yOffset, width, height, null);
    }

}

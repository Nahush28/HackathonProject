package Package;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Block extends Rectangle{
    private static final long serialVersionUID = 1L;

    public static final int blocksize = 200;
    private int id;

    public Block(int x, int y) {
        setBounds(x,y,blocksize,blocksize);
        //this.id = id;
    }

    public void tick() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x-(int)GameState.xOffset,y-(int)GameState.yOffset,width,height); ;
    }

}

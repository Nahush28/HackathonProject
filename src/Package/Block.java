package Package;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Block extends Rectangle{

    public static final int blocksize = 100;
    public Block(int x, int y) {
        setBounds(x,y,blocksize,blocksize);
    }

    public void tick() {

    }

    public void draw(Graphics g) {

        g.fillRect(x-(int)GameState.xOffset,y-(int)GameState.yOffset,width,height) ;
    }

}

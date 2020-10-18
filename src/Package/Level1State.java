package Package;

import java.awt.*;

public class Level1State extends GameState {

    private Player player;

    private Block[] b;

    public Level1State(GameStateManager gsm) {
        super(gsm);
    }

    public void init() {
        player = new Player(30,30);
        int ylength = 0;
        int xtop = 0;
        int xlength = 300;
        b = new Block[110];
        for (int i = 0; i<b.length-40; i++) {
            b[i] = new Block(200, ylength);
            ylength += 50;

        }
        for(int i = 0; i < 50; i++) {
            b[i+50] = new Block(700, xtop);
            xtop+=50;
        }
        for (int i = 0; i<10;i++) {
            b[i+100] = new Block (xlength, 400);
            xlength+=50;
        }

    }


    public void tick() {
        for(int i = 0; i < b.length; i++) {
            b[i].tick();
        }
        player.tick(b);
    }


    public void draw(Graphics g) {
        player.draw(g);

        for (int i = 0; i <b.length; i++) {
            b[i].draw(g);
        }
    }


    public void keyPressed(int k) {
        player.keyPressed(k);
    }


    public void keyReleased(int k) {
        player.keyReleased(k);
    }



}

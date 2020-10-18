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
        int ylength = 400;
        int ytop = 400;
        int xlength = 250;
        b = new Block[120];

        for (int i = 0; i<b.length-40; i++) {
            b[i] = new Block(200, ylength);
            ylength -= 50;

        }
        for(int i = 0; i < 50; i++) {
            b[i+50] = new Block(700, ytop);
            ytop-=50;
        }
        for (int i = 0; i<10;i++) {
            b[i+100] = new Block (xlength, 400);
            xlength+=50;
        }
        b[110] = new Block(250,300);
        b[111] = new Block(650, 300);
        b[112] = new Block(350, 200);
        b[113] = new Block(250, 100);
        b[114] = new Block(450, 0);
        b[115] = new Block(300, 0);
        b[116] = new Block(650, 150);
        b[117] = new Block(500, 100);
        b[118] = new Block(450, 300);
        b[119] = new Block(550, 250);

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

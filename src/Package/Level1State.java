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
        int xlength = 0;
        b = new Block[100];
        for (int i = 0; i<b.length; i++) {
            b[i] = new Block(xlength+100, 400);
            xlength += 100;

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

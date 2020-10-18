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
        int ylength = 400;  //OG 400
        int ytop = 400;  //OG 400
        int xlength = 250;  //OG 250
        b = new Block[155];  //number of blocks

        for (int i = 0; i<b.length-95; i++) {
            b[i] = new Block(200, ylength);
            ylength -= 50;

        }
        for(int i = 0; i < 50; i++) {
            b[i+50] = new Block(700, ytop); //OG x 700
            ytop-=50;  //OG 50
        }
        for (int i = 0; i<10;i++) {
            b[i+100] = new Block (xlength, 400); //OG y 400
            xlength+=50; // OG 50
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

        //Start Michael Blocks REFERENCE
        b[120] = new Block(400,-100);
        b[121] = new Block(500,-200);
        b[122] = new Block(300,-250);
        b[123] = new Block(620,-320);
        b[124] = new Block(400,-420);
        b[125] = new Block(650,-600);

        b[126] = new Block(300,-500);
        b[127] = new Block(250,-600);
        b[128] = new Block(400,-725);
        b[129] = new Block(400,-850);

        b[130] = new Block(260,-800);
        b[131] = new Block(300,-900);
        b[132] = new Block(500,-950);
        b[133] = new Block(650,-1000);
        b[134] = new Block(600,-1100);
        b[135] = new Block(650,-1200);
        b[136] = new Block(400,-1100);
        b[137] = new Block(300,-1150);
        b[138] = new Block(500,-1300);
        b[139] = new Block(650,-1350);

        b[140] = new Block(260,-1350);
        b[141] = new Block(300,-1400);
        b[142] = new Block(500,-1550);
        b[143] = new Block(650,-1400);
        b[144] = new Block(600,-1500);
        b[145] = new Block(650,-1600);
        b[146] = new Block(400,-1650);
        b[147] = new Block(300,-1700);
        b[148] = new Block(500,-1700);
        b[149] = new Block(650,-1750);
        b[150] = new Block(260,-1820);
        b[151] = new Block(300,-1870);
        b[152] = new Block(500,-1850);

        b[153] = new Block(400,-1900,true);
        b[154] = new Block(450,-1900,true);

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

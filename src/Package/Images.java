package Package;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Images {
    public static BufferedImage[] blocks;
    public static BufferedImage[] player;

    public Images() {
        blocks = new BufferedImage[1];
        player = new BufferedImage[1];

        try {
            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Brick_image.png"));
            player[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/the man.png"));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }





}

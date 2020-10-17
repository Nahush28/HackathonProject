package Package;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Images {
    public static BufferedImage[] blocks;

    public Images() {
        blocks = new BufferedImage[1];


        try {
            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Block/Brick Block image.png"));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }





}

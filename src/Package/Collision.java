package Package;

import java.awt.Point;

public class Collision {

    public static boolean playerBlock(Point p, Block  b) {
        return b.contains(p);
    }

}

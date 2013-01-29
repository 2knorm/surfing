package surfing.world;

import java.util.HashMap;
import surfing.core.Drawable;
import surfing.core.Flyable;
import surfing.core.Point;
import surfing.core.Vector;
import surfing.core.WorldObject;

/**
 *
 * @author nikolay.romashchenko@gmail.com
 */
public class Encounter extends WorldObject implements Flyable, Drawable {
    
    public Encounter(HashMap properties) {
        position = (Point) properties.get("position");
        direction = (Vector) properties.get("direction");
        speed = (double) properties.get("speed");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

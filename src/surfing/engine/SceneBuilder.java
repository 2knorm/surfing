package surfing.engine;

import java.util.HashMap;
import surfing.core.Point;
import surfing.core.Vector;
import surfing.core.WorldObject;
import surfing.world.Encounter;

/**
 *
 * @author nikolay.romashchenko@gmail.com
 */
public class SceneBuilder {

    public static Scene build(double key) {

        WorldObject[] objects = generateObjects(key);
        Scene scene = new Scene(objects);

        return null;
    }

    private static WorldObject[] generateObjects(double key) {
        return null;
    }

    private static WorldObject generateEncounter() {

        Point position = getRandomPoint();
        Vector direction = getRandomVector();
        double speed = getRandomDouble();
        HashMap properties = new HashMap();
        properties.put("speed", speed);
        properties.put("position", position);
        properties.put("directino", direction);
        
        Object object = new Encounter(properties);
        return null;
    }
}

package assignments.factory_method;

import assignments.factory_method.tiles.*;

public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        int rand = (int) (Math.random() * 3);
        switch (rand) {
            case 0:
                return new SwampTile();
            case 1:
                return new WaterTile();
            case 2:
                return new ForestTile();
        }
        return null;
    }
}

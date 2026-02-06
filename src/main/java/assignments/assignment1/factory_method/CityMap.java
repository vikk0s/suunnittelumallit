package assignments.assignment1.factory_method;

import assignments.assignment1.factory_method.tiles.BuildingTile;
import assignments.assignment1.factory_method.tiles.ForestTile;
import assignments.assignment1.factory_method.tiles.RoadTile;
import assignments.factory_method.tiles.*;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        int rand = (int) (Math.random() * 3);
        switch (rand) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            case 2:
                return new BuildingTile();
        }
        return null;
    }
}

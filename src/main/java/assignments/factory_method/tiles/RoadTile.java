package assignments.factory_method.tiles;

import assignments.factory_method.Tile;

public class RoadTile implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public String getDescription() {
        return "Road Tile";
    }
}

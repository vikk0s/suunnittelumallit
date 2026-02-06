package assignments.assignment1.factory_method.tiles;

import assignments.assignment1.factory_method.Tile;

public class RoadTile implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public String getDescription() {
        return "Road Tile";
    }
}

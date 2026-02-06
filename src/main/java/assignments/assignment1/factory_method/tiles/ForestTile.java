package assignments.assignment1.factory_method.tiles;

import assignments.assignment1.factory_method.Tile;

public class ForestTile implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public String getDescription() {
        return "Forest Tile";
    }
}

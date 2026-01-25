package assignments.factory_method.tiles;

import assignments.factory_method.Tile;

public class ForestTile implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public String getDescription() {
        return "Forest Tile";
    }
}

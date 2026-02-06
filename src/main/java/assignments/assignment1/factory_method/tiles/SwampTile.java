package assignments.assignment1.factory_method.tiles;

import assignments.assignment1.factory_method.Tile;

public class SwampTile implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public String getDescription() {
        return "Swamp Tile";
    }
}

package assignments.factory_method.tiles;

import assignments.factory_method.Tile;

public class SwampTile implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public String getDescription() {
        return "Swamp Tile";
    }
}

package assignments.factory_method.tiles;

import assignments.factory_method.Tile;

public class WaterTile implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public String getDescription() {
        return "Water Tile";
    }
}

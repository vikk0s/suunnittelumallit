package assignments.factory_method.tiles;

import assignments.factory_method.Tile;

public class BuildingTile implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getDescription() {
        return "Building Tile";
    }
}

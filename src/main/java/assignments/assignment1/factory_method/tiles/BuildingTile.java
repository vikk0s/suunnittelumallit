package assignments.assignment1.factory_method.tiles;

import assignments.assignment1.factory_method.Tile;

public class BuildingTile implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getDescription() {
        return "Building Tile";
    }
}

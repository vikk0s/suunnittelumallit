package assignments.assignment1.factory_method;

public abstract class Map {
    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(createTile().getCharacter() + " ");
            }
            System.out.println();
        }
    }
}

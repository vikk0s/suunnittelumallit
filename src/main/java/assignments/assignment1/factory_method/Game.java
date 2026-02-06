package assignments.assignment1.factory_method;

public class Game {
    public static void main(String[] args) {
        Game cityGame = new Game();
        Map cityMap = cityGame.createMap("city");
        cityMap.display();
        System.out.println();
        Game wildernessGame = new Game();
        Map wildernessMap = wildernessGame.createMap("wilderness");
        wildernessMap.display();
    }

    public Map createMap(String type) {
        if (type.equals("city")) {
            return new CityMap();
        } else if (type.equals("wilderness")) {
            return new WildernessMap();
        } else {
            return null;
        }
    }
}

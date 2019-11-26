package Other;

public class Map {
    private static Object[][] map;

    public Map(int sizeW, int sizeH) { map = new Object[sizeW][sizeH]; }

    public static void placeOnMap(Object obj, int x, int y){ map[x][y]=obj; }

    public static Object getByCoordinate(int x, int y){
        return map[x][y];
    }

    public static Object[][] getMap() {
        return map;
    }
}

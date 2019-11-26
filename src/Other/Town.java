package Other;

import static java.lang.Math.random;

public enum Town {
    FLOWER(13, 25),
    GREEN(32, 12),
    KITE(22,44),
    SUN(6,12),
    NONE((int)(random() * 50.0),(int)(random() * 50.0));

    private int xg;
    private int yg;
    Town(int xg, int yg) {
        this.xg=xg;
        this.yg=yg;
    }

    public int getXg() {
        return xg;
    }
    public int getYg() {
        return yg;
    }
}

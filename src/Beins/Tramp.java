package Beins;

public class Tramp extends Gnome {
    private String say;

    public Tramp(int x, int y, String name, String say) {
        setX(x);
        setY(y);
        setName(name);
        this.say = say;
    }

    @Override
    public String toString() {
        return "Создан Tramp "+getName()+ " на координатах " + "x=" +
                getX()  +
                " y=" + getY();
    }

    @Override
    public void say() {
        System.out.println(getName() + " говорит: " + this.say);

    }

}

package Beins;
import Other.*;

import java.util.Objects;

import static java.lang.Math.random;

public class Citizen extends Gnome {
    private Town town;
    private int hungry = 0;

    public Citizen(Town town, String name) {
        this.town=town;
        setName(name);
        setX(town.getXg());
        setY(town.getYg());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return hungry == citizen.hungry &&
                town == citizen.town;
    }

    @Override
    public int hashCode() {
        return Objects.hash(town, hungry);
    }

    @Override
    public String toString() {
        return "Создан Citizen " +
                getName()+ " в городе "+ town +" с характеристиками "+
                " hungry=" + hungry;
    }

    public void setTown(Town town){ this.town=town; }
    public Town getTown() {
        return this.town;
    }

    public void eat(){
        this.hungry+=(int)(random() * 100.0);
        System.out.println(getName()+" покушал и его сытость "+getHungry());
    }

    public int getHungry(){
        return this.hungry;
    }

    public void move(Town town) {
        Road p = new Road(this.town.getXg(), this.town.getYg(), town.getXg(), town.getYg(), town);
        setX(town.getXg());
        setY(town.getYg());

    }

}
package Beins;

import Other.*;

public class Gnome extends Existence implements Say, Think {
    private String name;

    @Override
    public void say() {
        System.out.println(getName()+" говорит: Привет");
    }

    public void think(String name, String think, Town town) {
        System.out.println(name + think + town);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


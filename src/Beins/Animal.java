package Beins;

import java.util.Objects;

import static java.lang.Math.random;

public class Animal extends Existence implements Say {
    private String type;
    private double fear;

    public Animal(int x, int y, String type) {
        setX(x);
        setY(y);
        this.type = type;
        this.fear = random();
    }

    public String getType() {
        return this.type;
    }

    public double getFear() {
        return this.fear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.fear, fear) == 0 &&
                type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fear);
    }

    @Override
    public void say() {
        System.out.println("Я тебя укушу");
    }

    @Override
    public String toString() {
        return "Создано Animal с характеристиками" +
                " type='" + type + '\'' +
                ", fear=" + (double)Math.round(fear*100)/100 +
                " на координатах x=" + getX() + " y="+ getY();
    }
}
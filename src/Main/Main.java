package Main;

import Other.Town;
import Other.Travel;

public class Main {
    public static void main(String[] args){

        Travel tr1 = new Travel();

        tr1.addTramp(13, 34, "Перегудин", "Удачного пути");
        tr1.addTramp(27, 15, "Капитонов", "Проходи, не задерживайся");
        tr1.addAnimal(29, 14, "Пес");
        tr1.addAnimal(26, 16, "Дракон");
        tr1.addCitizen(Town.FLOWER, Town.GREEN, "Знайка");
        tr1.about();
    }
}

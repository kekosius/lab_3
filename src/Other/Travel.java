package Other;

import Beins.*;

import java.util.Objects;

import static java.lang.Math.*;

public class Travel {
    Map map = new Map(100, 100);

    public Travel(){

    }
    public void addCitizen(Town town, Town townTo, String name) {
        Citizen  c = new Citizen(town, name);
        //System.out.println(c.getName());
        Map.placeOnMap(c, c.getX(),c.getY());
        System.out.println(c.toString());
        c.think(name," решил отправиться в город ", townTo);
        c.eat();
        int needFood = (int)round(pow(pow(town.getXg()-townTo.getXg(),2)+pow(town.getYg()-townTo.getYg(),2),0.5));
        while(c.getHungry()<needFood){
            System.out.println(name+" берет добавку ");
            c.eat();}
        System.out.println(name + " вышел из города " + c.getTown());
        c.move(townTo);
        System.out.println(name + " пришел в город " + c.getTown());
    }
    public void addTramp(int x, int y,String name, String say) {
        Tramp  t = new Tramp(x, y, name, say);
        //System.out.println(t.getName());
        Map.placeOnMap(t, x, y);
        System.out.println(t.toString());
    }
    public void addAnimal(int x, int y, String type){
        Animal  a = new Animal(x, y, type);
        System.out.println(a.toString());
        //System.out.println(a.getType());
        Map.placeOnMap(a, x, y);
    }



    public void about(){

        if(Map.getByCoordinate(22,44) instanceof Citizen){
            System.out.println("Меня зовут "+((Citizen) Map.getByCoordinate(22,44)).getName());
            System.out.println("Я живу в городе "+((Citizen) Map.getByCoordinate(22,44)).getTown());
        }
        if(Map.getByCoordinate(13,25) instanceof Citizen){
            System.out.println("Меня зовут "+((Citizen) Map.getByCoordinate(13,25)).getName());
            System.out.println("Я живу в городе "+((Citizen) Map.getByCoordinate(13,25)).getTown());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return map.equals(travel.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}

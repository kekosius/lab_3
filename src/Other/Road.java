package Other;

import Beins.Animal;
import Beins.Citizen;
import Beins.Tramp;

import java.util.Arrays;

import static java.lang.Math.*;

public class Road {
    Object[][] map = Map.getMap();
    public Road(int x1, int y1, int x2, int y2, Town town){
        int[][] arr;
        full:
        if (abs(x2-x1)>abs(y2-y1)){
            arr = new int [2][abs(x2-x1)+1];
            for (int j=1; j<abs(x2-x1); j++){
                arr[0][j]=x1+(int)signum(x2-x1)*j;
                arr[1][j]=y1+(int)signum(y2-y1)*round((int)signum(x2-x1)*j*abs(y2-y1)/abs(x2-x1));
                System.out.println("Знайка идет в точке ("+arr[0][j] +","+ arr[1][j] + ")");

                if(Map.getByCoordinate(arr[0][j],arr[1][j]) instanceof Tramp) {
                    System.out.println("На пути встречается бездомный коротыка " + ((Tramp) Map.getByCoordinate(arr[0][j], arr[1][j])).getName());
                    ((Citizen)( Map.getByCoordinate(x1,y1))).say();
                    ((Tramp) Map.getByCoordinate(arr[0][j], arr[1][j])).say();
                }
                if(Map.getByCoordinate(arr[0][j],arr[1][j]) instanceof Animal){
                    System.out.println("На пути встречается "+((Animal) Map.getByCoordinate(arr[0][j],arr[1][j])).getType());
                    if (!Battle.meeting(((Animal) Map.getByCoordinate(arr[0][j],arr[1][j])).getFear())){
                        break full;
                    }
                }
            }
            ((Citizen)( Map.getByCoordinate(x1,y1))).setTown(town);
            Map.placeOnMap(( Map.getByCoordinate(x1,y1)), x2, y2);
            Map.placeOnMap(0, x2, y2);
        }
        else {
            arr = new int [2][abs(y2-y1)];
            for (int j=1; j<abs(y2-y1); j++) {
                arr[1][j]=y1+(int) signum(y2-y1)*j;
                arr[0][j]=x1+(int) signum(x2-x1)*round((int)signum(y2-y1)*j*abs(x2-x1)/abs(y2-y1));
                System.out.println("Знайка идет в точке ("+arr[0][j] +","+ arr[1][j] + ")");

                if(Map.getByCoordinate(arr[0][j],arr[1][j]) instanceof Tramp) {
                    System.out.println("На пути встречается бездомный коротыка " + ((Tramp) Map.getByCoordinate(arr[0][j], arr[1][j])).getName());
                    ((Citizen)( Map.getByCoordinate(x1,y1))).say();
                    ((Tramp) Map.getByCoordinate(arr[0][j], arr[1][j])).say();
                }
                if(Map.getByCoordinate(arr[0][j],arr[1][j]) instanceof Animal) {
                    System.out.println("На пути встречается " + ((Animal) Map.getByCoordinate(arr[0][j], arr[1][j])).getType());
                    if (Battle.meeting(((Animal) Map.getByCoordinate(arr[0][j], arr[1][j])).getFear())) {
                        break full;
                    }
                }
            }
            ((Citizen)( Map.getByCoordinate(x1,y1))).setTown(town);
            Map.placeOnMap(( Map.getByCoordinate(x1,y1)), x2, y2);
            Map.placeOnMap(0, x2, y2);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return Arrays.equals(map, road.map);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(map);
    }
}

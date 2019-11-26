package Other;
public class Battle {
    public static boolean meeting(double fear){
        if (fear >= 0.5){
            System.out.println("Коротышка испугался и убежал");
            return false;
        } else {
            System.out.println("Коротышка не испугался и пошел дальше");
            return true;
        }

    }
}

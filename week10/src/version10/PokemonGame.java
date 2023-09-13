package version10;




import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;

public class PokemonGame {
    public static void main(String[] args) {
        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();


        c1.evolve();
//        s1.setHp(50);
//        s1.setLevel(1);
        System.out.println(c1.getLevel());
        System.out.println(c1.getHp());

        p1.attack();
        c1.attack();
        s1.attack();



    }
}
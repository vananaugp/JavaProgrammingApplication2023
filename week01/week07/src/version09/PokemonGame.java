package version09;


import book.ArrayListDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;

public class PokemonGame {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokomens = new ArrayList<>();
        Pokemon charizard = new Pokemon();
        Pokemon pikachu = new Pokemon("피카츄");
        Pokemon squirtle = new Pokemon("꼬부기", 1);

        pokomens.add(pikachu);
        pokomens.add(squirtle);
        pokomens.add(charizard);


        System.out.println(pokomens.get(1).getName());
        pokomens.get(2).setName("리자몽");
        pokomens.get(2).attack(pikachu);

        System.out.println(pokomens.size());
        pokomens.get(0).attack();


    }
}

//        System.out.println(Pokemon.getPokemonCount());
//        Pokemon squirtle = new Pokemon("꼬부기", 1);
//        Pokemon pikachu = new Pokemon("피카츄");
//        System.out.println(Pokemon.getPokemonCount());
//        Pokemon charizard = new Pokemon();
//        System.out.println(Pokemon.getPokemonCount());
//
//        System.out.println(pikachu.getName() + "의 체력은  " + pikachu.getHp() + "이고 레벨은 " +  pikachu.getLevel() + "입니다.");
//
//        squirtle.evolve(squirtle);
//        System.out.println(squirtle.getName());
//        squirtle.evolve(squirtle);
//
////        pikachu.name = "피카츄";
////        charizard.name = "리자몽";
//        //pikachu.setName("피카츄");
//        charizard.setName("리자몽");
//
////        pikachu.level = 3;
////        pikachu.hp = 100;
////        pikachu.setLevel(23);
////        pikachu.setHp(500);
//        pikachu.setLevel(23).setHp(500); //method chaining
//
////        charizard.level = 36;
////        charizard.hp = 800;
//        charizard.setLevel(36);
//
//        System.out.println(charizard.getName() + "의 체력은  " + charizard.getHp() + "이고 레벨은 " +  charizard.getLevel() + "입니다.");
//        charizard.evolve(charizard);
//        pikachu.evolve(pikachu);
//        pikachu.evolve(pikachu);
//        pikachu.setName("라이추");
//        System.out.println(pikachu.getName());
//        pikachu.evolve(pikachu);
//        System.out.println(pikachu.getName() + "의 체력은  " + pikachu.getHp() + "이고 레벨은 " +  pikachu.getLevel() + "입니다.");
//
//        charizard.attack(squirtle);
//        squirtle.attack();
//    }
//}


//넣는거 set, 꺼내는거 get
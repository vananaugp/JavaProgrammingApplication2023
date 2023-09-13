package book;
enum Gender1 { MALE, FEMALE }

enum Direction { EAST, WEST, SOUTH, NORTH }
public class EnumDemo01 {
    public static void main(String[] args) {
        Gender1 gender = Gender1.FEMALE;
        if (gender == Gender1.MALE)
            System.out.println(Gender1.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender1.FEMALE + "은 병역 의무가 없다.");

//        if (gender == Direction.SOUTH)
//            System.out.println(Direction.SOUTH + "는 누구?");
//        gender = 5;

        Direction drection = Direction.EAST;
        if(drection == Direction.SOUTH)
            System.out.println(Direction.SOUTH+ "는 누구?");


    }
}



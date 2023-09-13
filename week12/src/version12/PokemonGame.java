package version12;

public class PokemonGame {
    public static void main(String[] args) {
        Squirtle s1= new Squirtle();
        Pikachu p1 = new Pikachu();

        p1.evolve();
        s1.evolve();
//        Pokemon p1 = new Pikachu(); // upcast, 부모 클래스 타입의 변수는 자식 클래스 객체를 받을 수 있다
//        Pikachu p2 = new Pikachu(); // 캐스팅 X (형변환 X)
        //Pikachu p3 = new Pikachu(); // downcast 불가, 자식 클래스 타입의변수는 부모 클래스의 객체를 변환할 수 없다.

//        System.out.println(p1);
//        System.out.println(p2);

//        p1.attack();
//        p2.attack();

        //p1.type(); // Pokemon 변수 ( 부모 클래스 타입의 변수 ) 로 Pikachu 전용 ( 자식 클래스 전용 ) 메서드를 사용할 수 없다
//        p2.type(); //0

        // 명시적 형변환 (명시적 캐스팅)
        //Charizard p4 = (Charizard)p1; // 런타임 에러 -> 포켓몬으로 인지해서 문법적으로는 문제 없음 하지만 실행 중에 피카츄가 아니라 리자몽으로 다운캐스트 하려고 해서 에러
//        Pikachu p3 = (Pikachu)p1; // downcast 성공, 힙메모리에 생성된 원본 객체가 Pikachu이기 떄문에 다운캐스팅이 가능.
//        System.out.println(p3);
//        p3.type();
    }
}

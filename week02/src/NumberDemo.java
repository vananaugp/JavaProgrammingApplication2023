import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        int mach;
        int distance;
        mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");




        /* 스캐너 클래스 객체 scanner 생성, 표준 입력(키보드)*/

        /*Scanner in = new Scanner(System.in);
        System.out.println("첫번째 값으로 반지름, 두번째 값으로 원주율을 입력해주십시오.");
        int radius = in.nextInt();
        double pi = in.nextInt();//scanner 객체를 통해 실수 값을 입력 받는다
        System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.", radius, radius * radius * pi); */




        double radius;
        double area;

        radius = 10.0;
        area = radius * radius * 3.14;
        System.out.println("반지름이 "  + radius + "인 원의 넓이 : " + area); 
    }
}

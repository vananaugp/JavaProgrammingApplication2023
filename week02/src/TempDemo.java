import java.util.Scanner;

public class TempDemo {
    public static void main(String[] args) {
        // 화씨 온도 입력 : 100
        // 화씨 100도는 섭씨 37.7778도 입니다
        // (100°F − 32) × 5/9 = 37.778°C
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;

        while (true) {
            System.out.println("1) 화씨->섭씨   2) 섭씨->화씨   3) 종료 : ");
            int menu = sc.nextInt();

            if(menu==1){
                System.out.println("화씨 온도 입력 :");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
                System.out.println("화씨" + fahrenheit + "도는 섭씨" + celsius + "입니다");


            }else if(menu == 2){
                // 섭씨->화씨
                //(36.5°C × 9/5) + 32 = 97.7°F
                System.out.println("섭씨 온도 입력 :");
                celsius = sc.nextDouble();
                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                System.out.println("섭씨" + celsius + "도는 화씨" + fahrenheit + "입니다");

            }else if(menu == 3){
                System.out.println("온도 변환 프로그램을 종료합니다");
                break;
            }else{
                System.out.println("메뉴에서 골라주세요");
            }
        }
    }
}

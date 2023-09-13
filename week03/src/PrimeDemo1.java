import java.util.Scanner;

public class PrimeDemo1 {
    public static void main(String[] args) {
        // prime number
        // 1과 자기자신외에는 나누어 떨어지는 수가 없다
        // 반복문, 조건문, 카운터
        Scanner scanner = new Scanner(System.in);
        int count = 0; // 약수 갯수
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++){
            if(number % i == 0){ //나누어 떨어지면 약수
                count = count +1;
        }
    }
        if(count == 2) {
            System.out.println(number + "는(은) 소수입니다!");
        }else  {
            System.out.printf("%d는(은) 소수가 아닙니다.\n",number);
        }
    }
}

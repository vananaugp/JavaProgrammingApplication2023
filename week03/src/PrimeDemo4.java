import java.util.Scanner;

public class PrimeDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        for (int i=2; i<=number; i++){
            if(number % i == 0){
                isPrime = false;
                break; // 약수 발견 즉시 종료. 불필요한 루프 제거. 소수가 아닌 큰 수일수록 효과가 크고 소수일 경우 상관없다.
            }
           // System.out.print(i + " ");
        }
        //if(count == 0) {
        if(isPrime){ // 비교연산제거
            System.out.println(number + "는(은) 소수입니다!");
        }else  {
            System.out.printf("%d는(은) 소수가 아닙니다.\n",number);
        }
    }
}
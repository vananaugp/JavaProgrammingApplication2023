import java.util.Scanner;
public class PrimeDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        if(number < 2){
            isPrime = false;
        }else {
            for(int i=2;i<number;i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number + "는(은) 소수입니다!");
        }else{
            System.out.printf("%d는(은) 소수가 아닙니다~~\n", number);
        }
    }
}


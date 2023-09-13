import java.util.Scanner;

public class PrimeDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int count = 0;
        boolean isPrime = true;  // 4byte -> 1byte, 가독성 up
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        for(int i=2;i<number;i++){
            if(number % i == 0){
                //count = count + 1;
                isPrime = false;  // 대입연산만
            }
        }

        if(isPrime == true){
            System.out.println(number + "는(은) 소수입니다!");
        }else{
            System.out.printf("%d는(은) 소수가 아닙니다~~\n", number);
        }
    }
}

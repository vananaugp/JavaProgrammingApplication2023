import java.util.Scanner;

public class PrimeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        for(int i=2;i<number;i++){  // 반복횟수 -2
            if(number % i == 0){ //나누어 떨어지면 약수
                count = count + 1;
            }
        }

        if(count==0){  // 소수 판정여부는 카운터가 0이면 소수
            System.out.println(number + "는(은) 소수입니다!");
        }else{
            System.out.printf("%d는(은) 소수가 아닙니다~~\n", number);
        }
    }
}

import java.util.Scanner;





public class PrimeQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime;
        System.out.print("시작 정수 입력 : ");
        int startNo = scanner.nextInt();
        System.out.print("끝 정수 입력 : ");
        int endNo = scanner.nextInt();

        for (int k = startNo; k <= endNo; k++){
            isPrime = true;
            if(k < 2){
                isPrime = false;
            }else {
                for(int i=2;i<k;i++){
                    if(k % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) System.out.print(k + " ");
            }
        }
    }
}

import java.io.PrintStream;
import java.util.Scanner;

public class GenderDemo02 {
    // switch case (traditional style)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurityNumber = sc.nextLine();
        //System.out.println(socialSecurityNumber);
        //System.out.println(socialSecurityNumber.charat(6));
        char gender = socialSecurityNumber.charAt(6);

        switch (gender){
            case '1' :
            case '3' :
                System.out.println("남자");
                break;
            case '2' :
            case '4' :
                System.out.println("여자");
                break;
            default:
                System.out.println("잘못된 주민등록번호입니다.");



    }
}

}

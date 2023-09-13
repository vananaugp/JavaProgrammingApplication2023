import java.util.Scanner;

public class GenderDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurityNumber = sc.nextLine();
        //System.out.println(socialSecurityNumber);
        //System.out.println(socialSecurityNumber.charat(6));
        char gender = socialSecurityNumber.charAt(6);

        if(gender == '1' || gender == '3'){
            System.out.println("남자");
        } else if (gender == '2'  || gender == '4') {
            System.out.println("여자");


        }else {
            System.out.println("잘못된 주민등록번호 입니다.");
        }

    }
}

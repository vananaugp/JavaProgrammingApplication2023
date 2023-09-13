import java.util.Scanner;

public class GenderDemo04 {
    // yield

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurityNumber = sc.nextLine();
        char gender = socialSecurityNumber.charAt(6);

        String genderString = switch (gender){
            case '1' , '3' -> "남자";
            case '2' , '4' -> "여자";
            default -> {
                System.out.println("엇! 아이쿠!");
                yield "잘못된 주민등록번호입니다";
                //yield 랑 sout  바꾸면 에러남 무조건 yield는 sout 뒤에 나와야함
            }

        };
        System.out.println(genderString);


    }
  }



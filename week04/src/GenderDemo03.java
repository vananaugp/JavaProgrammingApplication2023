import java.util.Scanner;

public class GenderDemo03 {
        // switch case (modern style)

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String socialSecurityNumber = sc.nextLine();
            char gender = socialSecurityNumber.charAt(6);

            String genderString = switch (gender){
                case '1' , '3' -> "남자";
                case '2' , '4' -> "여자";
                default -> "잘못된 주민등록번호입니다";
            };
            System.out.println(genderString);


            }
        }



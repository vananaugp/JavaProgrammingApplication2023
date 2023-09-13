package exam;

import java.util.ArrayList;
import java.util.Scanner;

/* 에바렌드 매표소 직원은 방문한 고객들의 나이를 계산하여 총 액을 알려준다
단 방문고객의 단위는 정해져 있지않다.
요금은 어른 이만원 청소년 만원 어린이 오천원이다
8세미만은 어린이 8세 이상 19살 까지는 청소년 20세 이상은 어른

프로그램 실행 예시
몇분이세요? ?
1번분나이:
2번분나이:
3번분나이:

고객님 총 요금은 45000원 입니다
 */



    public class MidtermExamExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> ages = new ArrayList<>();
            System.out.println("몇 분이세요?");
            int humans = scanner.nextInt();

            int total = 0; // 총 요금

            for (int i = 0; i < humans; i++) {
                System.out.print(i + 1);
                System.out.print("번분 나이 입력 : ");
                ages.add(scanner.nextInt()); // 나이를 입력 받아 ages ArrayList에 추가
            }

            for (int i = 0; i < humans; i++) {
                int age = ages.get(i);

                if (age > 19)
                    total = total + 20000;
                else if (age >= 8)
                    total = total + 10000;
                else
                    total = total + 5000;
            }
            System.out.println("고객님 총 요금은" + total + "원 입니다");


        }
    }

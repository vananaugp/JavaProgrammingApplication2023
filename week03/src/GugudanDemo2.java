import java.util.Scanner;

public class GugudanDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for (int i=1; i<10; i++)
            //System.out.println(dan + " * " + i + " = " + (dan*i));
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);

    }
}


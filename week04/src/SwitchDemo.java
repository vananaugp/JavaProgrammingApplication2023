public class SwitchDemo {
        public static void main(String[] args) {
            System.out.println(howMany(1) + " 있다.");
            System.out.println(howMany(2) + " 있다.");
            System.out.println(howMany(3) + " 있다.");
        }

        static String howMany(int n) {
            String texts;
            if ( n ==1 ) {
                texts = "한개";
            } else if ( n == 2 ) {
                texts = "두개";
            } else {
                texts = "많이";
            }
            return texts;


                  /* return switch (n) {
                  case 1  -> "한개";
                  case 2  -> "두개";
                  default -> "많이";
                  } */

            }
        }




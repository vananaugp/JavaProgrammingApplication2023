public class TypeDemo {
    public static void main(String[] args) {
        boolean bb = true;
        //System.out.println((int)bb);
        //bb = 0;
        //boolean을 int형태로 못바꿈


        int i = 127; // 4byte signed integer
        byte b = (byte) i; // 1byte signed byte
        System.out.println(i);
         //자료의 형변환을 할 때 자료의 손실을 염두해야함. 형변환한 라인에서만 잠깐 바이트로 사용하고 다시 int 형태로 돌아옴
        System.out.println(b); // 부호가 있는 byte의 범의 -128 ~ 127

        // 2byte unicode character , C언어는 1byte ascii
        //char c = '나'; // 0 ~ 65535
        // c = 65; // A
        //char c = '\ub098'; // home.unicode.org -> code charts -> Hangul Syllables
        //char c = 45208;

        char k = '김', s = '\uC2E0', g = 44396;
        //System.out.print( k );
        //System.out.print( s );
        //System.out.println( g );
        System.out.printf("%c%c%c\n", k ,s, g);

        //prinf = c 언어방식을 따름
    }
}

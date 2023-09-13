package pattern;
import midterm.Pokemon;
class Singleton{
    private static Singleton s = new Singleton();
    //public Singleton(){
    private  Singleton(){
        System.out.println("단 하나의 객체!");
    }


    //public static Singleton getS() {
       public static Singleton getInstance() {
        return s;


    }


    @Override
    public String toString() {
        return "싱글톤 객체 (해시코드 값 : " + Integer.toHexString(hashCode()) + ")";
    }
}








public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();
        System.out.println(Singleton.getInstance());
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1. toString());
        System.out.println(s2);
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        Pokemon p3 = new Pokemon();
        System.out.println(p1);
        System.out.println(p2. toString());
        System.out.println(p3);
    }
}

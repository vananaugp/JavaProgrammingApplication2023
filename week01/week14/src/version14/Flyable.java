package version14;

public interface Flyable {
    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}

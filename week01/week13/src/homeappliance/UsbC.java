package homeappliance;

public interface UsbC {
    //public abstract String ShapeC();
    default String ShapeC(){ // public abstract는 생략 가능, JDK가 자동 삽입해줌
        return "라운딩 처리된 C타입 인터페이스";
    }
}

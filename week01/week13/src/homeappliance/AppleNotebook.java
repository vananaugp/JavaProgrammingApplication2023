package homeappliance;

public class AppleNotebook extends Notebook implements UsbC{

    @Override
    public String ShapeC() {
        return UsbC.super.ShapeC() + ", 썬더볼트 3 지원";
    }
}

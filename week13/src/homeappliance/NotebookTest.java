package homeappliance;

public class NotebookTest {
    public static void main(String[] args) {
        LgNoteBook gram = new LgNoteBook();
        SamsungNotebook galaxyBook = new SamsungNotebook();
        AsusNotebook vivoBook = new AsusNotebook();
        AppleNotebook macBook = new AppleNotebook();

        gram.display();

        System.out.println(galaxyBook.ShapeA());
        System.out.println(galaxyBook.ShapeC());

        System.out.println(vivoBook.ShapeA());
        System.out.println(macBook.ShapeC());
    }
}

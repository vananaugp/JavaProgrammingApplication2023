package sec03;

interface Portable {
	void inMyBag();

}

public class Notebook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("��Ʈ���� ���濡 �ִ�.");
	}

	public void turnOn() {
		System.out.println("��Ʈ���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("��Ʈ���� ����.");
	}

	public static void main(String[] args) {
		Controllable.reset();

		Notebook n = new Notebook();
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();

		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}
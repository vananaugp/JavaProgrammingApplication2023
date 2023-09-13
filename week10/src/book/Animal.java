package book;

public class Animal {
	String eye;
	String mouth;

	void eat(String food) {
		System.out.println(food + "를(을) 냠냠");
	}

	void sleep() {
		System.out.println("쿨쿨 zzz~");
	}
}

class Eagle extends Animal {
	String wing;

	void fly() {
		System.out.println("날아 갑니다.");
	}
}

class Tiger extends Animal {
	String leg;

	@Override
	void eat(String food) {
		//super.eat(food);
		System.out.println(food + "을(를) 게걸스럽게 잡아먹습니다.");
	}

	void run() {
		System.out.println("질주 합니다");
	}
}

class Goldfish extends Animal {
	String fin;

	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}
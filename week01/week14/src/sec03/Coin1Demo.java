package sec03;

interface Coin {
	//public static final int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}

public class Coin1Demo {
	public static void main(String[] args) {

		//Coin.DIME = 50;   // final
		System.out.println("Dime�� " + Coin.DIME + "��Ʈ�Դϴ�.");  //static, public
	}
}

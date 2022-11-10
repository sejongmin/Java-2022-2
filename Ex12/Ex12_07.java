package Ex12;

class Car15{
	int speed = 0;
	final void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan6 extends Car15{
	final static String CAR_TYPE = "승용차";
}

public class Ex12_07 {

	public static void main(String[] args) {
		System.out.println("Sedan 클래스 타입 -->" + Sedan6.CAR_TYPE);

	}

}

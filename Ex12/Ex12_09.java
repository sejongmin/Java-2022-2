package Ex12;

abstract class Car17{
	int speed= 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
	abstract void work();
}

class Sedan8 extends Car17{
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck2 extends Car17{
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}

public class Ex12_09 {

	public static void main(String[] args) {
		Sedan8 sedan1 = new Sedan8();
		sedan1.work();
		Truck2 truck1 = new Truck2();
		truck1.work();
	}

}

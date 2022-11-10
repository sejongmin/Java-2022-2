package Ex12;

abstract class Car16{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan7 extends Car16{
	
}

class Truck1 extends Car16{
	
}

public class Ex12_08 {

	public static void main(String[] args) {
		Sedan7 sedan1 = new Sedan7();
		System.out.println("승용차 인스턴스 생성~~~");
		Truck1 truck1 = new Truck1();
		System.out.println("트럭 인스턴스 생성~~~");

	}

}

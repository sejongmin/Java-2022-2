package Ex12;

class Car12{
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(슈퍼블래스) : " + this.speed);
	}
}

class Sedan3 extends Car12{
	void upSpeed(int speed) {
		super.upSpeed(speed);
		this.speed += speed;
		if (this.speed > 150)
			this.speed = 150;
		System.out.println("현재속도(서브클래스) : " + this.speed);
	}
}

public class Ex12_06 {

	public static void main(String[] args) {
		Sedan3 sedan1 = new Sedan3();
		sedan1.upSpeed(300);
		
		System.out.println(sedan1.speed);

	}

}

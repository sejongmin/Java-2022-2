package Ex12;


class Car12{
	private String color;
	int speed;
}

class Sedan3 extends Car12{
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}

public class Ex12_04 {

	public static void main(String[] args) {
		Sedan3 sedan1 = new Sedan3();
		
		sedan1.setSpeed(300);
		System.out.println("승용차 속도 ==> " + sedan1.speed);

	}

}

package Ex11;

class Car2{
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}
	
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Ex11_03 {

	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");

	}

}

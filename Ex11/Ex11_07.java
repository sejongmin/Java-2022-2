package Ex11;

class Car5{
	private String color;
	private int speed;
	
	Car5(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}

public class Ex11_07 {

	public static void main(String[] args) {
		Car5 myCar1 = new Car5("빨강", 0);
		Car5 myCar2 = new Car5("파랑", 30);
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

	}

}

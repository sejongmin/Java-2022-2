package Ex11;

class Car7 {
	String color;
	int speed;
	static int count = 0;
	
	Car7(){
		count++;
	}
}
public class Ex11_10 {

	public static void main(String[] args) {
		Car7 myCar1 = new Car7();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.count);
		
		Car7 myCar2 = new Car7();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar2.count);
		
		Car7 myCar3 = new Car7();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar3.count);

	}

}

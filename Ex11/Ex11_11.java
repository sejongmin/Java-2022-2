package Ex11;

class Car8{
	String color;
	int speed;
	private static int count = 0;
	
	Car8(){
		count++;
	}
	
	static int getCount() {
		return count;
	}
}

public class Ex11_11 {

	public static void main(String[] args) {
		System.out.println("현재 생산된 자동차 숫자 ==> " + Car8.getCount());
		
		Car8 myCar1 = new Car8();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.getCount());

	}

}

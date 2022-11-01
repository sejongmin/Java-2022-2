package Problem;

class Pet1{
	private String type;
	private int age;
	
	Pet1(String type, int age){
		this.type = type;
		this.age = age;
	}
	
	void move() {
		System.out.printf("%s가 움직입니다.\n" ,this.type);
	}
	
	void agePrint() {
		System.out.printf("%s는 %d개월 입니다.\n", this.type, this.age);
	}
}


public class Problem_30 {

	public static void main(String[] args) {
		Pet1 dog = new Pet1("강아지", 8);
		Pet1 cat = new Pet1("고양이", 8);
		dog.move();
		cat.move();
		dog.agePrint();
		cat.agePrint();
	}

}

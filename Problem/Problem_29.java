package Problem;

class Pet{
	String type;
	int age;
	
	void move() {
		System.out.printf("%s가 움직입니다.\n" ,this.type);
	}
	
	void agePrint() {
		System.out.printf("%s는 %d개월 입니다.\n", this.type, this.age);
	}
}

public class Problem_29 {

	public static void main(String[] args) {
		Pet dog = new Pet();
		Pet cat = new Pet();
		
		dog.type = "강아지";
		dog.age = 8;
		
		cat.type = "고양이";
		cat.age = 13;
		
		dog.move();
		cat.move();
		dog.agePrint();
		cat.agePrint();

	}

}

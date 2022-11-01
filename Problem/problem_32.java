package Problem;

class Pet3{
	int weight;
	String type;
	String name;
	
	void move() {
		System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다.");
	}
}

class Dog extends Pet3{
	Dog(int weight, String name){
		this.weight = weight;
		this.name = name;
		this.type = "강아지";
	}
}

class Bird extends Pet3{
	Bird(String type){
		this.type = type;
	}
	
	void canDo() {
		System.out.print("날 수 있습니다");
	}
	void move() {
		super.move();
		System.out.print("서브클래스 move() : 새가 날아갑니다.");
	}
}

public class problem_32 {

	public static void main(String[] args) {
		Dog dog = new Dog(10, "누렁이");
		Bird bird = new Bird("앵무새");
		
		dog.move();
		bird.move();
		System.out.println("강아지의 이름은 " + dog.name + "고, 몸무게는 " + dog.weight + "Kg 입니다.");
		System.out.print("새의 종류는 " + bird.type + "고, ");
		bird.canDo();
	}

}

package Problem;

interface Mammal{
	void canDo();
}

interface Fish{
	void move();
}

class Whale implements Mammal, Fish{
	public void move() {
		System.out.println("물고기는 헤엄치며 움직입니다.");
	}
	
	public void canDo() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
	
}


public class Problem_34 {

	public static void main(String[] args) {
		Whale whale = new Whale();
		whale.move();
		whale.canDo();
	}

}

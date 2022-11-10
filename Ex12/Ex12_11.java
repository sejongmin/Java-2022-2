package Ex12;

interface Car20{
	abstract void work();
}

interface Cannon{
	abstract void fire();
}

class Tank implements Car20, Cannon{
	public void work() {
		System.out.println("탱크가 앞으로 굴러갑니다.");
	}
	public void fire() {
		System.out.println("탱크가 대포를 발사합니다.");
	}
}

public class Ex12_11 {

	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.work();
		tank1.fire();

	}

}

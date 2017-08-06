package exam09;

public class Horse {
	
	public int speed = 0;
	public String name;
	
	public Horse(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startHorse() {
		System.out.println(this.name + "이 뛰기 시작합니다.");
	}
	public void runningHorse() {
		System.out.println(this.name + "이 뛰는 중입니다.");
	}
	public void endHorse() {
		System.out.println(this.name + "이 결승점에 도착했습니다.");
	}

}

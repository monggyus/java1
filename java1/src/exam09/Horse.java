package exam09;

public class Horse {
	
	public int speed = 0;
	public String name;
	
	public Horse(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startHorse() {
		System.out.println(this.name + "�� �ٱ� �����մϴ�.");
	}
	public void runningHorse() {
		System.out.println(this.name + "�� �ٴ� ���Դϴ�.");
	}
	public void endHorse() {
		System.out.println(this.name + "�� ������� �����߽��ϴ�.");
	}

}

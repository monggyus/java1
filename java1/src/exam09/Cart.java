package exam09;

public class Cart {
	public String name;
	public int speed = 0;
	
	public Cart(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public void startCart() {
		System.out.println(name + "�� ����߽��ϴ�.");
	}
	
	public void runningCart() {
		System.out.println(name + "�� �޸��� �ֽ��ϴ�.");
	}
	
	public void stopCart() {
		System.out.println(name + "�� �����߽��ϴ�.");
	}

}

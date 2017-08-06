package exam09;

public class Cart {
	public String name;
	public int speed = 0;
	
	public Cart(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public void startCart() {
		System.out.println(name + "가 출발했습니다.");
	}
	
	public void runningCart() {
		System.out.println(name + "가 달리고 있습니다.");
	}
	
	public void stopCart() {
		System.out.println(name + "가 도착했습니다.");
	}

}

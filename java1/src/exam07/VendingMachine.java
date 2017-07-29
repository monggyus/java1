package exam07;

public class VendingMachine implements Sale {
	
	private Drink d;

	@Override
	public void insertMoney(int money) {
		System.out.println(money + "원을 넣음");
	}

	@Override
	public void pushButton(Drink d) {
		this.d = d;
		System.out.println(d.getName() + "를 고름");
	}

	@Override
	public Drink getDrink() {
		return d;
	}
	

}

package exam07;

public class VendingMachine implements Sale {
	
	private Drink d;

	@Override
	public void insertMoney(int money) {
		System.out.println(money + "���� ����");
	}

	@Override
	public void pushButton(Drink d) {
		this.d = d;
		System.out.println(d.getName() + "�� ��");
	}

	@Override
	public Drink getDrink() {
		return d;
	}
	

}

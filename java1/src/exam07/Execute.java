package exam07;

public class Execute {
	
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney(1000);
		vm.pushButton(new Coke());
		Drink d = vm.getDrink();
		
		System.out.println(d.getName() + "¸¦ ¸¶½É");
	}

}

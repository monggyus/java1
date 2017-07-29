package exam06;

public class FoodMarket {
	
	public void sale(Food f) {
		if(f instanceof Rice) {
			Rice r = (Rice)f;
			r.discountInfo();
		}
		f.saleFood();
	}
	
	public static void main(String[] args) {
		Ramen ramen = new Ramen();
		Rice rice = new Rice();
		Drink drink = new Drink();
		
		FoodMarket fm = new FoodMarket();
		fm.sale(ramen);
		fm.sale(rice);
		fm.sale(drink);
	}

}

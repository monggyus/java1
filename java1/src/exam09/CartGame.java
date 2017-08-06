package exam09;

import java.util.ArrayList;
import java.util.List;

public class CartGame extends Thread {

	public Cart c;

	public CartGame(Cart c) {
		this.c = c;
	}

	public void run() {
		c.startCart();
		try {
			Thread.sleep(c.speed);
			c.runningCart();
		} catch (Exception e) {
			e.printStackTrace();
		}
		c.stopCart();
	}

	public static void main(String[] args) {
		String[] cartNames = { "�ڶ�����", "�̸�����", "���ö���", "��Ŭ����", "���ڽ���", "�뱸��ũ" };
		List<CartGame> cartList = new ArrayList<CartGame>();
		for (int i = 1; i < cartNames.length; i++) {
			int speed = (int) (Math.random() * 3000) + 1000;
			Cart c = new Cart(cartNames[i], speed);
			CartGame cg = new CartGame(c);
			cg.start();
			cartList.add(cg);
		}
		for (CartGame cg : cartList) {
			try {
				cg.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��� �����߽��ϴ�");
	}

}

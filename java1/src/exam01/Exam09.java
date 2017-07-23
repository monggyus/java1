package exam01;

public class Exam09 {
	public static void main(String[] args) {
		int[] bank = new int[10];
		for (int i = 0; i < bank.length; i++) {
			bank[i] = i + 1;
		}

		for (int j = 0; j < bank.length; j++) {
			System.out.println("bank[" + j + "] : " + bank[j]);
		}
	}

}

package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���۰�");
		String initStr = scan.nextLine();

		int initNum = Integer.parseInt(initStr);

		System.out.println("���ᰪ");
		String finStr = scan.nextLine();

		int finNum = Integer.parseInt(finStr);

		int num = 0;

		for (int i = initNum; i <= finNum; i++) {
			if (i % 3 == 0 || i % 2 == 0) {
				System.out.print(i);
				num += i;
			}
		}
		System.out.println(num);
	}

}

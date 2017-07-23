package exam01;

import java.util.Scanner;

public class Exam05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Number?");
		String str = scan.nextLine();
				
		int inputNum = Integer.parseInt(str);
		if(inputNum==1) {
			System.out.println("Your number is 1");
		}else if(inputNum==2) {
			System.out.println("Your number is 2");
		}else {
			System.out.println("I don't know your number");
		}
	}

}

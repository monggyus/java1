package exam01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("input your id=>");
		String id = s.nextLine();
		System.out.println("input your pw.");
		System.out.println("but, pw is number only");
		
		String pwd = s.nextLine();
		int pwdNum = 0;
		try {
			pwdNum = Integer.parseInt(pwd);	
		}catch(Exception e) {
			System.out.println("숫자좀 입력하세요");
		}
				
		System.out.println(id+pwd);
		System.out.println(pwdNum);
	}

}

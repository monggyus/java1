package exam05;

import java.util.ArrayList;

public class ObjectExam {
	
	public static void main(String[] args) {
		
		Object o = "asdf";
		o = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		al2.add("asdf");
		al2.add(1);
		String str = new String("123");
		String str2 = new String("123");
		System.out.println(str);
		System.out.println(str2);
	}

}

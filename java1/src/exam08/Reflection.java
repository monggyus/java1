package exam08;

import java.lang.reflect.Method;

public class Reflection {
	
	public static void main(String[] args) {
		Exam ex = new Exam();
		ex.print();
		ex.print("³ª³ª³ª");
		try {
		Class cls = Class.forName("exam08.Exam");
		Method[] m = cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].toString());
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

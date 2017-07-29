package exam06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementsExam implements InterFaceExam {

	@Override
	public void printStr(String str) {
		System.out.println(str);
	}	
	
	public static void main(String[] args) {
		InterFaceExam ife = new ImplementsExam();
		ife.printStr("afdsafd");
		InterFaceExam ife2 = new PrintExam();
		ife2.printStr("sadfasfd");
		
		List list = new ArrayList();
		list.add("asdfasf");
		List list2 = new LinkedList();
		list2.add("afdasf");
	}

}

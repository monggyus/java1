package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "1");
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		al.add(hm);
		
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
//		hm2.put("asdf", new ArrayList<String>());
		
		ArrayList<String> al2 = new ArrayList<String>();
		String str = new String("1");
		al2.add("1");
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(1);
		
		hm2.put("asdf",  al2);

	}

}

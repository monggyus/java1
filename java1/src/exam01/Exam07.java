package exam01;

public class Exam07 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int num = 1;
//		System.out.println(num);
//		num = num + 1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num += 1;
		for(int i=0;i<10;i++) {
			if(i%3==0 && i!=0) {
			System.out.println("3의배수 : " + i);
			}else if(i%2==0 && i!=0) {
				System.out.println("2의배수 : " + i);
				
			}
		}
	}

}

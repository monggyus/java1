package exam01;

public class Exam10 {
	public static void main(String[] args) {
		int[] nums = new int[30];
		int resultNum = 0;

		for(int i=0;i<nums.length;i++) {
			nums[i] = i+1;
			if(i%2==0) {
				resultNum += nums[i];
			}
		}
		System.out.println(resultNum);
	}
		
}

package exam09;


public class ExamThread extends Thread{
	
	int threadId;
	
	public ExamThread(int threadId) {
		this.threadId = threadId;
	}
	
	public void run() {
		System.out.println("난" + this.threadId + " ID 쓰레드의 시작점이야.");
		try {
			int time = (int)(Math.random()*3000)+1;
			Thread.sleep(time);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("난" + this.threadId + " ID 쓰레드의 종료점이야.");
	}
	
	public static void main(String[] args) {
		System.out.println("난 이 프로그램의 시작점이다.");
		ExamThread eh1 = new ExamThread(1);
		ExamThread eh2 = new ExamThread(2);
		ExamThread eh3 = new ExamThread(3);
		ExamThread eh4 = new ExamThread(4);
		ExamThread eh5 = new ExamThread(5);
		ExamThread eh6 = new ExamThread(6);
		ExamThread eh7 = new ExamThread(7);
		ExamThread eh8 = new ExamThread(8);
		ExamThread eh9 = new ExamThread(9);
		ExamThread eh10 = new ExamThread(10);
		eh1.start();
		eh2.start();
		eh3.start();
		eh4.start();
		eh5.start();
		eh6.start();
		eh7.start();
		eh8.start();
		eh9.start();
		eh10.start();
		System.out.println("난 이 프로그램의 종료점이다.");
		System.exit(0);
		
	}

}

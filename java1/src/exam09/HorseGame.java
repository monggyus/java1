package exam09;

public class HorseGame extends Thread{
	public Horse h;
	
	public HorseGame(Horse h) {
		this.h = h;
	}
	
	public void run() {
		h.startHorse();
		try {
			Thread.sleep(h.speed);
			h.runningHorse();
		}catch(Exception e) {
			e.printStackTrace();
		}
		h.endHorse();
	}
	public static void main(String[] args) {
		String[] horseNames = {"리플","대구은행","라코","이더리움","비트코인"};
		for(int i=1;i<horseNames.length;i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			Horse h = new Horse(speed, horseNames[i]);
			HorseGame hg = new HorseGame(h);
			hg.start();
		}
	}

}

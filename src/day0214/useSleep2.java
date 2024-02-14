package day0214;

import java.util.Random;

public class useSleep2 implements Runnable {
	
	@Override
	public void run() {
		System.out.print("loading");
		try {
			Random r = new Random();
			for(int i = 0; i < 15; i++) {
				System.out.print(" . ");
				Thread.sleep(r.nextInt(10)*100);
			}	// end for
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	// end catch
		System.out.print("finish");
	}	// run
	
	public static void main(String[] args) {
		useSleep2 us2 = new useSleep2();
		Thread t = new Thread(us2);
		t.start();
	}	// main

}	// class
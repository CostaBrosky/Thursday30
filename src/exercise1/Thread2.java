package exercise1;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1001);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#");
		}
	}
}

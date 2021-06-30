package exercise2;

import java.util.List;

public class List3 implements Runnable {

	private List<Integer> vector3;

	public List3(List<Integer> list) {
		vector3 = list;
	}

	@Override
	public void run() {
		try {
//			Thread.sleep(1500);
			double sum = 0;
			for (Integer d : vector3)
				sum += d;
			System.out.println("Sum third part: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

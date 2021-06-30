package exercise2;

import java.util.List;

public class List2 implements Runnable {

	private List<Integer> vector2;

	public List2(List<Integer> list) {
		vector2 = list;
	}

	@Override
	public void run() {
		try {
//			Thread.sleep(1000);
			double sum = 0;
			for (Integer d : vector2)
				sum += d;
			System.out.println("Sum second part: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

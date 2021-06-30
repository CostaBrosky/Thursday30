package exercise2;

import java.util.List;

public class List1 implements Runnable{

	private List<Integer> vector1;

	public List1(List<Integer> list) {
		vector1 = list;
	}

	@Override
	public void run() {
		try {
//			Thread.sleep(500);
			double sum = 0;
			for (Integer d : vector1)
				sum += d;
			System.out.println("Sum first part: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
//	
//	double sum = 0;
//	for(int i = 0; i < m.size(); i++)
//	    sum += m.get(i);
//	return sum;


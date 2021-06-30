package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Runnable r1 = new List1(random(999));
		Runnable r2 = new List2(random(1000));
		Runnable r3 = new List3(random(1000));
		
		
		Thread l1 = new Thread(r1);
		Thread l2 = new Thread(r2);
		Thread l3 = new Thread(r3);
		
		l1.start();
		try {
			l1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		l2.start();
		try {
			l2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		l3.start();
		try {
			l3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
//		try {
//			l1.join();
//			l2.join();
//			l3.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
	}
	
	public static List<Integer> random(int j) {
		List<Integer> al = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < j; i++) {
			int pick = rand.nextInt(350);
			al.add(pick);
			
		}
		return al;
	}
	
}


//Esercizio #2
//Scrivere un programma multithread in Java che dato un array di 3000 valori numerici generati casualmente ne esegue la somma in modo parallelo. 
//Creare 3 thread e assegnare ad ogni thread una partizione dell’array (1000 valori). 
//Ogni thread esegue la somma dei propri valori e mettere il risultato in una struttura dati del thread main contenente i risultati parziali. 
//Il thread main deve sincronizzarsi sulla terminazione (join) dei thread figli dopodiché somma i risultati parziali e li stampa su console.

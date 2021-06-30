package exercise1;

public class Start {
	
	public static void main(String[] args) {
		
		Runnable r1 = new Thread1();
		Runnable r2 = new Thread2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}


//Esercizio #1
//Creare un’applicazione con due thread figli. Ciascuno dei due thread ha associato un simbolo (ad es. * o #). 
//Fare in modo che ciascun thread stampi su console il proprio simbolo per 10 volte, attendendo 1 secondo tra una stampa e l'altra.
package Practica1Hilos;

public class Hilos extends Thread {

	@Override
	public void run() {
		try {
			int random = (int) (Math.random() * 5 + 1);
			System.out.println("Soy el " + getName() + " y me duermo " + random + " segundos");
			sleep(random * 1000);
			System.out.println("Soy el " + getName() + " y he terminado de dormir.");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

package Practica1Client;

public class Worker extends Thread {
	private Cartera cartera;

	public Worker(Cartera cartera) {
		this.cartera = cartera;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				cartera.decrementar(Math.random() * 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

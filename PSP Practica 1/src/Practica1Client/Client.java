package Practica1Client;

public class Client extends Thread {
	private Cartera cartera;

	public Client(Cartera cartera) {
		this.cartera = cartera;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				cartera.incrementar(Math.random() * 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

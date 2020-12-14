package Practica1Client;

public class Main {

	public static void main(String[] args) {
		Cartera cartera = new Cartera(0);

		Client[] clients = new Client[10];
		for (Client client : clients) {
			client = new Client(cartera);
			client.start();
		}

		Worker[] workers = new Worker[10];
		for (Worker worker : workers) {
			worker = new Worker(cartera);
			worker.start();
		}

	}

}

package Practica1Hilos;

public class Main{
	public static void main(String[] args){
		
		Hilos thread;
		
		for(int i=0;i<100;i++) {
			thread= new Hilos();
			thread.start();
		}
	}
}

package com.cice.tutorialjava.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacemos una autodefinición del metodo run del interfaz runnable
		//implementacion del hilo con expresion lambda
		new Thread(()->{
			while(true){
				System.out.println("ejecutando hilo 1...");
			}
		}).start();
		//misma implementacion del hilo metodo tradicional sin lambda)
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println("ejecutando hilo 2...");
				}
				
			}
			
		}).start();
	}

}

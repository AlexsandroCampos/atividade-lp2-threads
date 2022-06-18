package multithreads.multithreads;

import java.security.SecureRandom;

public class readBufferDoubleArray implements Runnable{
	private static final SecureRandom
	generator = new SecureRandom();
	private final buffer sharedLocation;

	public readBufferDoubleArray(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		double sum = 0.0;
		for (int count =1;count <=10;count ++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.getBufferDoubleArray();
				System.out.printf("\t\t\t\t\t\t%,.2f\n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %,.2f%n%s%n",
				"Leitura do total de valores: ", 
				sum, "Leitura finalizada!");
	}
	//criar um readBuffer para cada tipo de vetor criado
	//Ou fazer tudo dentro do método run
}
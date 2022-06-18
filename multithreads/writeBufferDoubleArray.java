package multithreads.multithreads;

import java.security.SecureRandom;

public class writeBufferDoubleArray implements Runnable{
	private static final SecureRandom
	generator = new SecureRandom();
	private final buffer sharedLocation;
	public writeBufferDoubleArray(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		double sum = 0.0;
		for (double count =1.0;count <=10.0;count = count + 1.0) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.putBufferDoubleArray(count);
				sum+=count;
				System.out.printf("\t\t\t%,.2f\n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.printf("%n%s %,.2f%n%s%n",
				"Escrita do total de valores: ",
				sum, "Escrita finalizada!");
	}

	//criar um writeBuffer para cada tipo de vetor criado
	//Ou fazer tudo dentro do método run
}

package multithreads.multithreads;

public class unsysnchronizedBuffer implements buffer {
	private int buffer = -1;
	private int i = 0;
	private int j = 0;
	private int z = 0;
	private int y = 0;
	private int g = 0;
	private int a = 0;
	private int[] bufferIntArray = new int[10];
	private double[] bufferDoubleArray = new double[10];
	private String[] bufferStringArray = new String[10];

	@Override
	public void putBuffer(int value) 
			throws InterruptedException{
		System.out.printf("Escrita valor do putBuffer: \t\t\t\t%d", value);
		buffer = value;
	}

	@Override
	public int getBuffer() throws InterruptedException{
		System.out.printf("Leitura valor do getBuffer: \t\t\t\t%d", buffer);
		return buffer;
	}

	@Override
	public void putBufferIntArray(int value) throws InterruptedException{
		System.out.printf("Escrita valor do putBufferIntArray: \t\t%d", value);
		bufferIntArray[y] = value;
		y++;
	}

	@Override
	public int getBufferIntArray()
			throws InterruptedException {
		int readValue = bufferIntArray[i];
		System.out.printf("Leitura valor do getBufferIntArray: \t\t%d", readValue);
		if(i != 10) {
			if(readValue != 0 && bufferIntArray[i+1] != 0)
				i++;
		}
		return readValue;
	}

	@Override
	public void putBufferDoubleArray(double value)
			throws InterruptedException {
		System.out.printf("Escrita valor putBufferDoubleArray: \t\t%,.2f", value);
		bufferDoubleArray[a] = value;
		a++;
	}

	@Override
	public double getBufferDoubleArray()
			throws InterruptedException {
		double readValue = bufferDoubleArray[j];
		System.out.printf("Leitura valor do getBufferDoubleArray: \t\t%,.2f", readValue);
		if(j != 10) {
			if(readValue != 0 && bufferDoubleArray[j+1] != 0)
				j++;
		}
		return readValue;
	}

	@Override
	public void putBufferStringArray(String value) throws InterruptedException {
		System.out.printf("Escrita valor do putBufferStringArray: \t\t%s", value);
		bufferStringArray[g] = value;
		g++;
	}

	@Override
	public int getBufferStringArray() throws InterruptedException {
		int actualValue;
		System.out.printf("Leitura valor do getBufferStringArray: \t\t%s", bufferStringArray[z]);
		if(bufferStringArray[z] == null)
			actualValue = 0;
		else {
			actualValue = Integer.parseInt(bufferStringArray[z]);
			if(z != 10) {
				if(actualValue != 0 &&  bufferStringArray[z+1] != null)
					z++;
			}
		}
		return actualValue;
	}

}

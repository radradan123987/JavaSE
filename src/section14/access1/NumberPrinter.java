package section14.access1;

public class NumberPrinter {
	
	public void printerNumber() throws InterruptedException {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			Thread.sleep(1000);
		}
	}

}

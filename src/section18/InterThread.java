package section18;

public class InterThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("InterThread 시작!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread 종료!");
	}

}

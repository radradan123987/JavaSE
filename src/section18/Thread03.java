package section18;
/*
 * synchronized 키워드
 * 	멀티 스레드에서 동기화 시켜주는 키워드 
 * 
 */
import section18.access1.Brother;
import section18.access1.Sister;
import section18.access1.Wallet;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		Wallet wallet = new Wallet();
		
		Sister sister = new Sister(wallet);
		
		Brother brother = new Brother(wallet);
		
		sister.start();
		brother.start();
		
		
		System.out.println("메인 메서드 종료!");
		
		
	}

}

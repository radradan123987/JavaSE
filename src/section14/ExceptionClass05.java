package section14;

import section14.access1.NumberPrinter;

/*
 * throws 키워드
 * 	자바에서 메서드나 생성자가 예외를 던질 수 있읍을 선언하는 키워드
 * 	메서드가 예외를 처리하지 않고 해당 예외를 호출한 곳으로 넘어가고자 할 때 사용.
 * 
 * 
 * 
 * 
 */
public class ExceptionClass05 {
	public static void main(String[] args) throws InterruptedException {
		
		NumberPrinter np = new NumberPrinter();
		
		// 첫번째 try ~ catch
		/*
		try {
			np.printerNumber();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		// 두번쨰 throws 예외 던지기(미루기)
		np.printerNumber();
		
		
		// throw 키워드 강제로 Exception 발생시키기
		throw new NullPointerException();
		
	}

}

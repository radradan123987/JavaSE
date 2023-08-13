package section05;
/*
 * 3. for 문
 *  초기식, 조건식, 증감식을 이용하여 반복하는 명령어
 *  
 *  for(초기식; 조건식; 증감식) {
 *  	반복 수행할코드 영역
 *  }
 * 
 */
public class Loop03 {
	public static void main(String[] args) {
		// for 문을 이용하여 0~99까지 출력
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		int i = 0; // 초기식
		while(i < 100) {   // 조건식
			System.out.println(i);
			i++; // 증감식
		}
		
	}

}

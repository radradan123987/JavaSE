package section05;
/*

1번 

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
			
   *   		
  ***		
 *****		
*******		
 *****		
  ***		
   *
   		
*/
public class LoopHomeWork {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("1=======================");
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
		    for(int j = 0; j < i; j++) {
			    System.out.print("*");
			
		    }
		System.out.println();
		}
		System.out.println("2=======================");
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
		for(int k = 1; k <= i*2-1; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		System.out.println("======================================");
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < 7; j++) {
				if(i <= 7/2) {
					if(j < 3 - i) {
						System.out.print(" ");
					}else if (j > 3 + i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if (j < i - 3) {
						System.out.print(" ");
					} else if ( j > 9 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					} 
				}
			}	
			System.out.println();
		}
		System.out.println("   ☆");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7; j++) {
				if(j < 3 - i) {
					System.out.print(" ");
				} else if (j > 3 + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();	// 개행
		}
		System.out.println("  | | Merry Chrismas ~*");
		
	}
	
	
}

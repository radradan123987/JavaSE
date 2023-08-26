package section10;
import section10.access4.Jindo;
/*
 * final 클래스
 * 	클래스 키워드 앞에 final 키워드 추가할 경우
 * 	클래스 상속의 마지막임을 뜻한다. 상속불가클래스
 * 
 * 
 */
import section10.access4.PersianCat;

public class Inheritance03 {
	public static void main(String[] args) {
		PersianCat pCat = new PersianCat();
		pCat.walk();
		
		// Cat final 클래스 상속받지 못해 접근 불가
//		pCat.eat();
//		pCat.meow();
		
		Jindo jindo = new Jindo();
		jindo.bark();
		
		
		
	
	}
		
	

}

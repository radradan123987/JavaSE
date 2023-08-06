package section02;

import java.util.Scanner;

/*
 * Scanner
 *  사용자로부터 데이터를 읽기 위해 사용되는 클래스
 *  Scanner 클래스를 사용하면 키보드로 입력한 텟스트, 숫자등 읽을수 있다.
 *  
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, address;  //문자열 값을 담는 변수
		int age;			   // 정수 값을 담는 변수
		double weight;		   // 실수 값을 담는 변수
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scan.next();
		address = scan.next();
		age = scan.nextInt();
		weight = scan.nextDouble();
		
		System.out.printf("당신의 이름은 %s 입니다.\n, name");
		System.out.printf("당신의 주소는 %s 입니다.\n, address");
		System.out.printf("당신의 나이는 %d 입니다.\n, age");
		System.out.printf("당신의 체중은 %.1fkg 입니다.\n, weight");
	}

}

package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 
 * 객체를 바이트 스트림으로 읽기/쓰기 클래스
 * 
 * 작열화, 객체를 일련의 byte로 변환해준다.
 * 
 */
public class IO08 {
	public static void main(String[] args) {
		MembarVO membar = new MembarVO();
		membar.setName("피카츄");
		member.setAge(27);
		
		String filePath = "./upload/member.obj";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(member);
			
			oos.flush();
			
			System.out.println("MemberVO 객체 파일화 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null)oos.close();
				if(fos != null)fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}

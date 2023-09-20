package section19;

import java.io.BufferedInputStream; 
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 자바에서 성능을 향상시켜주기 위한 I/O 보조 스트림
 * 
 */
public class IO05 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("./upload2/hello3.txt");
			bos = new BufferedOutputStream(fos);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush(); // 버퍼에 남은 데이터를 파일에 쓰고 버퍼를 비움
			
			System.out.println("파일이 복사 완료하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			   try {
			          if(bos != null) bos.close();
			          if(bos != null) bos.close();
			          if(bos != null) bos.close();
			          if(bos != null) bos.close();
		} catch (IOException e) {
			     e.printStackTrace();
		}
		
	}
  }
}

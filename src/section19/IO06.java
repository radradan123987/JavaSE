package section19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * 문자단위로 파일을 읽기/쓰기 기능을 제공하는 클래스
 * 
 */
public class IO06 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fr new FileReader(",/upload/hello.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("./upload2/hello4.txt");
			bw = new BufferedWriter(fw);
			
			int readCharCnt = 0;
			char[] c = new char[4];
			
			while((readCharCnt = br.read(c)) != -1) {
				bw.write(c, 0, readCharCnt);
				System.out.println(new String(c, 0, readCharCnt));
			}
			
			bw.flush();
			
			System.out.println("문자단위로 파일 복사 완료!");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
			} catch (IOException e) {
				
			}
		}
	}

}

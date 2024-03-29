package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		Scanner sc = new Scanner(System.in);
		
		FileInputStream oldFile = null; 
		FileOutputStream newFile = null;
		System.out.println("▽파일명 입력▽");
		String myfile = sc.next();
		
		try {
			oldFile = new FileInputStream("C:\\woosin\\file\\"+myfile);
			newFile = new FileOutputStream("C:\\woosin\\file\\upload\\"+myfile);
			
			byte[] copy = new byte[100];
			/*
			int result;
			while((result = oldFile.read(copy)) != -1) {
				newFile.write(copy,0,result);
			}
			*/
			while(true) {
				int result = oldFile.read(copy);
				if(result == -1) break;
				newFile.write(copy,0,result);
				
			}
			
			System.out.println("복사완료");
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일명이 없습니다.");
			//e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("파일처리중 예외발생!");
			//e.printStackTrace();
		}
		finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				System.out.println("close 에러발생");
			}
		}
		
	}

}











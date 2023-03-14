package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		//현재날짜
		LocalDate today = LocalDate.now();
		DateTimeFormatter td = DateTimeFormatter.ofPattern("yyyyMMdd");
		today.format(td);
		
		//파일생성
		File tdfile = new File("C:\\woosin\\file\\"+today+"file");
		
		if(!tdfile.exists()) {
			tdfile.mkdir();
			System.out.println("오늘날짜 파일 생성완료.");
		}
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		System.out.println("▽파일명을 입력하세요▽");
		String fname = sc.next();
		sc.nextLine();
		
		try {
			fw = new FileWriter("C:\\woosin\\file\\"+today+"file\\"+fname+".txt");
			bw = new BufferedWriter(fw);
			System.out.println("============이하 내용 입력============");
			
			while(true) {
				String input = sc.nextLine();
				
				if(input.equals("그만")) {
					System.out.println("입력종료");
					break;
				}
				
				else {
					bw.write(input+"\r\n");
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println("=====================================================");
		
		//파일읽기
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\woosin\\file\\"+today+"file\\"+fname);
			br = new BufferedReader(fr);
			
			String readstr;
			
			while((readstr = br.readLine())!=null) {
				System.out.println(readstr);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		}
		
		
		
		
	}

}






















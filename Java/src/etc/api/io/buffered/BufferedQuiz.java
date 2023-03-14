package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
         1. Date클래스를 이용해서 file폴더 내에 하위 경로로
          오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.
         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
          파일을 작성합니다. 
          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
         4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
          파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner input = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		File file = new File("C:\\Work\\file\\" + now.format(dtf) + "file");

		if(!file.exists()) { 
			file.mkdir();
			System.out.println("폴더 생성 완료!");
		} else {
			System.out.println("해당 폴더가 존재합니다.");
		}

		BufferedWriter bw = null;
		System.out.print("파일명을 입력해주세요: ");
		String name = input.next();
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Work\\file\\" + now.format(dtf) + "file\\" + name + ".txt"));
			System.out.println("내용 입력을 시작합니다.");
			System.out.println("'그만'을 입력하시면 중지됩니다.");
			input.nextLine();
			String text = "";
			while(true) {
				String str = input.nextLine();
				if(str.equals("그만")) {
					System.out.println("파일이 작성되었습니다.");
					break;
				}
				text += str + "\r\n";
			}
			
			bw.write(text);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("*** 파일을 읽습니다. ***");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Work\\file\\" + now.format(dtf) + "file\\" + name + ".txt"));
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

package CSIS2175.L_Chapter_3b;
//Date : 2020.05.28
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (~p31)
//Subject : File Input and Output - FileOut

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut {

	public static void main(String[] args) {
		
		// 파일 경로를 지정해 주고,
		Path file = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\Grade.txt");
		
		String s = "ABCDF";
		
		// 스트링 s 값을 byte형 array(배열) 값으로 변환해 주고 (변환? 이라기보다는 바이트값을 가져다가 배열에 넣는다고 생각)
		byte[] data = s.getBytes();
		
		// System.out.println(data); // => 값이 [B@5caf905d 이렇게 나옴 (byte형?)
		
		// OutputStream의 output 객체를 생성?
		OutputStream output = null;
		
		try
		{
			// 내생각엔 위에 OutputStream output = new Buffer~~ 이런식으로 한줄에 써도 되지않을까 싶음.
			// ** BufferedOutputStream = > Child of FilterOutputStream, which is a child of OutputStream;
			// BufferedOutputStreamhandles input from a system’s standard (or default) output device, usually the monitor.
			// 여튼 이 클래스를 이용해서 output에 새 환경을 만들어준다고 생각.
			output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			
			
			
			output.write(data);
			
			
			
			// When using output buffer, Clears any bytes that have been sent to a buffer for output, 
			// ,but have not yet been output to a hardware device.
			// 아웃풋 버퍼를 쓸때 사용. 출력을 위해 버퍼로 전송되었지만 아직 하드웨어 장치로 출력되지 않은 바이트를 지움.
			output.flush();			 
			
			
			// 항상 close를 써줘야하는듯.
			output.close();
			
			// 완료되면 해당 경로에 Grade.txt 파일이 생성됨!
		}
		
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}

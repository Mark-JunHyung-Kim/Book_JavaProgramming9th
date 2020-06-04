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
		
		// ���� ��θ� ������ �ְ�,
		Path file = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\Grade.txt");
		
		String s = "ABCDF";
		
		// ��Ʈ�� s ���� byte�� array(�迭) ������ ��ȯ�� �ְ� (��ȯ? �̶�⺸�ٴ� ����Ʈ���� �����ٰ� �迭�� �ִ´ٰ� ����)
		byte[] data = s.getBytes();
		
		// System.out.println(data); // => ���� [B@5caf905d �̷��� ���� (byte��?)
		
		// OutputStream�� output ��ü�� ����?
		OutputStream output = null;
		
		try
		{
			// �������� ���� OutputStream output = new Buffer~~ �̷������� ���ٿ� �ᵵ ���������� ����.
			// ** BufferedOutputStream = > Child of FilterOutputStream, which is a child of OutputStream;
			// BufferedOutputStreamhandles input from a system��s standard (or default) output device, usually the monitor.
			// ��ư �� Ŭ������ �̿��ؼ� output�� �� ȯ���� ������شٰ� ����.
			output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			
			
			
			output.write(data);
			
			
			
			// When using output buffer, Clears any bytes that have been sent to a buffer for output, 
			// ,but have not yet been output to a hardware device.
			// �ƿ�ǲ ���۸� ���� ���. ����� ���� ���۷� ���۵Ǿ����� ���� �ϵ���� ��ġ�� ��µ��� ���� ����Ʈ�� ����.
			output.flush();			 
			
			
			// �׻� close�� ������ϴµ�.
			output.close();
			
			// �Ϸ�Ǹ� �ش� ��ο� Grade.txt ������ ������!
		}
		
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}

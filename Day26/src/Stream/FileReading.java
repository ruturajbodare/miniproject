package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream ("one.text");
		int i;
		while((i=f.read())!=-1);
		{
			System.out.println((char)i);
		}
		
		
		}

}

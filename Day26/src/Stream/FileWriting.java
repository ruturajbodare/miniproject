package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream ("one.text");
	    String s="Hello word";
	    byte b[]=s.getBytes();
	    fout.write(b);
	    fout.close();
	    System.out.println("created");
	    
		
	}

}

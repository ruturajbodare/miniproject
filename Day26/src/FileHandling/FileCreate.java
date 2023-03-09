package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("d:/a1.txt");
        		if(f.createNewFile())
        		{
        			System.out.println("file is succesfully created");
        			
        		}
        		else
        		{
        			System.out.println("file already exist");
        		}
	}

}

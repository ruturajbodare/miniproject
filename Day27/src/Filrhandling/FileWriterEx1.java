package Filrhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.attribute.FileTime;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileWriter fw=new FileWriter("d:/studentnew.csv");
        fw.write("id,Name,Adress");
        fw.write("\n12,ruturaj,phaltan");
        fw.write("\n13,Anita,Nagar"); 
        fw.write("\n14,pooja,wai");
        fw.close();
	}

}

 
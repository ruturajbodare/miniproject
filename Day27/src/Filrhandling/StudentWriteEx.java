package Filrhandling;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    FileWriter fw=new FileWriter("d:/student1.csv");
        fw.write("id,Name,sub1,sub2,sub3,sub4");
        fw.write("\n12,ruturaj,70,56,76,75");
        fw.write("\n13,Anita,87,90,67,86"); 
        fw.write("\n14,pooja,99,67,98,78");
        fw.close();

	}

}

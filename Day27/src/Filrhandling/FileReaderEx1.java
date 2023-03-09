package Filrhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader f=new FileReader("d:/studentnew.csv");
String id,Name,Adress;
BufferedReader br=new BufferedReader(f);
String col=br.readLine();
String row=br.readLine();
System.out.println(col);
while(row!=null)
{
	String []s=row.split(",");
	id=s[0];
	Name=s[1];
	Adress=s[2];
	System.out.println(id +Name +Adress);
	row=br.readLine();
	
}
		
	}


}

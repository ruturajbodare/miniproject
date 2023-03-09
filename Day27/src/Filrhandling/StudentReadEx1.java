package Filrhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReadEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("d:/student1.csv");
		String id,Name,sub1,sub2,sub3,sub4;
		BufferedReader br=new BufferedReader(f);
		String col=br.readLine();
		String row=br.readLine();
		System.out.println(col);
		while(row!=null)
		{
			String []s=row.split(",");
			id=s[0];
			Name=s[1];
			sub1=s[2];
			sub2=s[3];
			sub3=s[4];
			sub4=s[5];
			System.out.println(id +","+Name +","+ sub1+","+sub2+","+sub3+","+sub4);
			row=br.readLine();
			
		}
	}

}
 
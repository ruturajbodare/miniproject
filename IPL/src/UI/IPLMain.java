package UI;

import java.sql.SQLException;
import java.util.Scanner;

import service.IPLService;

public class IPLMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String s;
       Scanner sc=new Scanner(System.in);
		System.out.println("IPLManageme ntSystem");
		System.out.println("1.View IPL");
		System.out.println("2.Add IPL");
		System.out.println("3.Update IPL");
		System.out.println("4.Delete IPL");
		IPLService i=new IPLService();
		do
		{
		System.out.println("Enter the choice ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		        i.viewall();
		break;
		case 2:
			i.insertIPL();
			
		break;
		case 3:
			i.updateIPL();
		break;
		case 4:
			i.deleteIPL();
		break;
		}
		System.out.println("do you want to continue");
		s=sc.next();
	}
		while(s.equals("yes"));
		}
}


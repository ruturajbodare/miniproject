package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.IPLDeoImpl;
import com.entity.IPL;

public class IPLService {
	public void viewall()throws ClassNotFoundException,SQLException
	{
		List<IPL>list=new IPLDeoImpl().findAll();
		for(IPL i:list)
		{
			System.out.println(i);
		}
	}
	public void insertIPL() throws ClassNotFoundException,SQLException
	{
	IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	System.out.println("enter the teamname");
	String teamname=sc.next();
	System.out.println("enter the city");
	String city=sc.next();
	System.out.println("enter the state");
	String state=sc.next();
	i.setTeamid(teamid);
	i.setTname(teamname);
	i.setCity(city);
	i.setState(state);
	new IPLDeoImpl().insertIPL(i);
	}
	
	public void updateIPL() throws ClassNotFoundException,SQLException

	{
	IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the teamname");
	String teamname=sc.next();
	System.out.println("enter thecity");
	String city=sc.next();
	System.out.println("enter the state");
	String state=sc.next();
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	i.setTeamid (teamid);
	i.setTname(teamname);
	i.setCity(city);
	i.setState(state);
	new IPLDeoImpl().updateIPL(i);

	}
	public void deleteIPL() throws ClassNotFoundException, SQLException
	{
		IPL i=new IPL();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int teamid=sc.nextInt();//
		i.setTeamid(teamid);
		
		new IPLDeoImpl().deleteIPL(i);
	}
}

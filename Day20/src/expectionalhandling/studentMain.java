package expectionalhandling;

public class studentMain {

	public static void main(String[] args) throws StudentInvalidException {
		// TODO Auto-generated method stub
		student s[]=new student[3];
		int i;
		for(i=0;i<s.length;i++)
		{
		 s[0]=new student(1001,"hari","CBE");
		 s[1]=new student(13,"Madhi","Banglore");
		 
		 s[2]=new student(14,"Akshey","mumbai");
		}
		for(student s1:s)
		{
			System.out.println(s1);
		}
		getName(s);
	}
public static void getName(student s[]) throws StudentInvalidException
{
	for(int i=0;i<s.length;i++)
	{
	if(s[i].getId()==1001)
	{
		System.out.println(s[i].getSname());
	}
	
	else
	{
	throw new StudentInvalidException("invalid student id");
	}}


	}

}

package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(11,"ruturaj","girvi");
		Employee emp2=new Employee(12,"ravi","indapur");
		Employee emp3=new Employee(13,"pranit","phaltan");
		FileOutputStream fout=new FileOutputStream("d:/input.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.writeObject(emp3);
		out.close();

	}

}

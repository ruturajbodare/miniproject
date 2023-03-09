package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DeserlizationEx1 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fin=new FileOutputStream("d:/input.txt");
		ObjectOutputStream oin=new ObjectOutputStream(fin);
		Employee e=(Employee)oin.readObject();
		System.out.println(e);
		Employee e1=(Employee)oin.readObject();
		System.out.println(e1);
		Employee e2=(Employee)oin.readObject();
		System.out.println(e2);
		
	}

}

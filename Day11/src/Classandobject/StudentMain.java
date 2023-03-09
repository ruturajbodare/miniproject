package Classandobject;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[]= {78,90,78,67,88};
		Student s1=new Student();
		s1.id=1001;
		s1.name="ruturaj";
		s1.address="Phaltan";
		s1.mark=m1;
		System.out.println(s1);
		System.out.println("-----------------------");
		int m2[]= {67,90,78,67,98};
		Student s2=new Student();
		s2.id=1002;
		s2.name="Ram";
		s2.address="Phaltan";
		s2.mark=m2;
		System.out.println(s2);
		System.out.println("-----------------------");
		int m3[]= {58,98,75,69,88};
		Student p1=new Student();
		p1.id=1001;
		p1.name="ruturaj";
		p1.address="Phaltan";
		p1.mark=m3;
		System.out.println(s1);
		System.out.println("-----------------------");

	}

}

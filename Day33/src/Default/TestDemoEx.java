package Default;

public class TestDemoEx implements TestInterfaceEx {


	@Override
	public int square(int n) {

		return n*n
				;
	}
	public static void main(String[] args) {
		TestDemoEx t= new TestDemoEx();
		t.display();
		System.out.println(t.square(2));
		

	}

}

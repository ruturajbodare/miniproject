package Interface;

public class Eight extends Student implements Percentage {
	int sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;




	public Eight(int id, String name, String address, int sub1, int sub2, int sub3, int sub4, int sub5, int sub6, int sub7,
			int sub8) {
		super(id, name, address);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.sub7 = sub7;
		this.sub8 = sub8;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getSub5() {
		return sub5;
	}

	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}

	public int getSub6() {
		return sub6;
	}

	public void setSub6(int sub6) {
		this.sub6 = sub6;
	}

	public int getSub7() {
		return sub7;
	}

	public void setSub7(int sub7) {
		this.sub7 = sub7;
	}

	public int getSub8() {
		return sub8;
	}

	public void setSub8(int sub8) {
		this.sub8 = sub8;
	}


		// TODO Auto-generated method stub
		public double Percentage()
		{
		return(sub1+sub2+sub3+sub4+sub5+sub6+sub7+sub8)/8;

		}
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("percentages are="+Percentage());
			
		}

	@Override
	public String toString() {
		return super.toString()+ "Eight [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4 + ", sub5=" + sub5 + ", sub6="
				+ sub6 + ", sub7=" + sub7 + ", sub8=" + sub8 + " percentage="+ Percentage()+"]";
	}

		
	}



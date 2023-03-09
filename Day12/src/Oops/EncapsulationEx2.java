package Oops;
 class Calculation
 {
	private long length;
	private long height;
	private long area;
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	public long getArea() {
		area=length*height;
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	
 }

public class EncapsulationEx2 {

	public static void main(String[] args) {
		Calculation mm= new Calculation();
		mm.setLength(24);
		mm.setHeight(22);
		 System.out.println("length:"+mm.getLength()+"\nheight;"+mm.getHeight()+"\nArea:"+mm.getArea());
		

	}

}

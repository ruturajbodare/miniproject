package Practice;

public class Student {
	private int id;
	private String Name;
	private String Adress;
	
	public Student()
	{
		
	}

	public Student(int id, String name, String adress) {
		super();
		this.id = id;
		Name = name;
		Adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Adress=" + Adress + "]";
	}
	

}

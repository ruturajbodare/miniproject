package Constructor;

public class Employe {
	 int id;
	    String name;
	    double salary;
	    public Employe()
	    {
	    	
	    }
	    public Employe(int r,String i,double j)
	    {
	    	id=r;
	    	name=i;
	    	salary=j;
	    }
	    public Employe(int i, String string, String string2) {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		double annualSalary()
	    {
	    	return salary*12.0;
	
	}
	    double pf()
	    {
	    	return(salary*0.18);
	    	
	    }
		@Override
		public String toString() {
			return ("id=" + id + "\nname=" + name + "\nsalary=" + salary + "\nannualsalary="+annualSalary()+"\npf="+pf());
		}


}

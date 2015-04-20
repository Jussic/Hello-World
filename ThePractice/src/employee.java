public class employee
{
	private String name; 
	private String lastname;
	private int age;
	private double income;
	
	public employee (String n, String l, int a, double i){
		name = n;
		lastname = l; 
		age = a;
		income = i;
	}
	
	public employee (){
		name = "jule";
		lastname = "brown";
		age = 22;
		income = 1000.45;
	}
	
	// GETTER 
	public String getName(){
		return name;
	}
	public String getLastname(){
		return  lastname;
	}
	public int getAge (){
		return age;
	}
	public double getIncome (){
		return income;
	}
	
	// SETTER	
	public void setName (String n)
	{
		name = n;
	}
	public void setLastname (String l){
		lastname = l;
	}
	public void setAge (int a)
	{
		age = a; 
	}
	public void setDouble (double d)
	{
		income = d; 
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", lastname=" + lastname + ", age="
				+ age + ", income=" + income + ", getName()=" + getName()
				+ ", getLastname()=" + getLastname() + ", getAge()=" + getAge()
				+ ", getIncome()=" + getIncome() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}

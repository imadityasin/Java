package constructors;



public class Program_03 {
    //Parameterized Constructor.
	Program_03(String StudentName, int Age) {
		String name=StudentName;
		int age=Age;
		System.out.println(name +" "+ age);
	}
	
	public void displayInfo()
	{
		System.out.println("Aditya Singh");
		System.out.println("25");
	}
	
	public static void main(String[] args) {
		Program_03 yes=new Program_03("Aditya", 25);
		yes.displayInfo();
	}
}
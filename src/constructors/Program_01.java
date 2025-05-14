package constructors;

public class Program_01 {
	Program_01() 
	{
		int a=0;
		String name=null;
		System.out.println("Hello1");
	}
	
	void show() 
	{
		System.out.println("Hello2");
	}
}
	class B
	{
		public static void main(String [] args)
		{
			Program_01 yes=new Program_01();
			yes.show();
		}
	}
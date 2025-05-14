// Default Constructor.

package constructors;

// Class with default constructor
public class Program_02 {
	    
	// Instance variables
	   String model;
	   int year;

	// Default constructor
	   Program_02() {
		   model = "Toyota";
		   year = 2020;
	   }

	    // Method to display car info
	    void display() {
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	public static void main(String[] args) 
	{
        // Create object of Car
	    Program_02 myCar = new Program_02();
	        
	    // Display car info
	    myCar.display();
	}
}
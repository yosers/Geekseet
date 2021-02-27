import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeekseetApp extends Calculation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Person> listP = new ArrayList<Person>();
		
		Scanner myObj = new Scanner(System.in); 
		
		for ( int i = 1; i <= 2; i++) {
			Person person = new Person();

			System.out.println("Enter Person "+ i + " Age: ");
		    person.setAge( myObj.nextInt() );  
		    
		    System.out.println("Enter Person "+ i + " Year: ");
		    person.setYear( myObj.nextInt() );
		    
		    listP.add(person);
		} 
		
	    witch(listP);  
	}
 
 
	
	
 
}
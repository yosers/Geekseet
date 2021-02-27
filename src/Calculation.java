import java.util.List;

public class Calculation{
	
	public static int witch(List<Person> persons) { 
		int temp; 
		int first = 0;
		int second = 0;
		double sum; 
		int increament = 0;
		for (Person checkPerson : persons) {
			
			increament++;
			if (checkPerson.getYear() <= checkPerson.getAge() || checkPerson.getAge() <= 0 || checkPerson.getYear() <= 0) {
				 System.out.println("Age must greater then year or age and year must greater then 0"); 
				 return -1;
			}
			
			temp = checkPerson.getYear() - checkPerson.getAge();
			if (persons.indexOf(checkPerson) == 0) {
				first = valueFibonacci(temp); 
			}
			
			System.out.println("Person " + increament + " born on Year = " + checkPerson.getYear() + "-" + checkPerson.getAge() +" = " + temp  
			+ ", number of people killed on year " + temp + " is " + 	valueFibonacci(temp) + ".");
			
			if (persons.indexOf(checkPerson) == persons.size() -1 ) {
				second = valueFibonacci(temp);
				sum =  (first + second) / 2f;
				System.out.println("So the average is ( "+ second + "+" + first +" )/2 = " + sum);
			}
		} 
		
		return 0;
	}
	
	public static int valueFibonacci(int input) {		
		int result = 0;
		int start = 1;
		int last = 0;
		int theLast = 0;
		int temp = 0;
		
		for ( int i = 0; i < input + 1; i++ ) { 
			theLast = last;
			last = start;
			start = theLast + last;
			
			temp +=  theLast;  
		}
		result = temp; 
		return result;
	}
}

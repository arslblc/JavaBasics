package w3school;

public class array {
	
	public static void main(String[] args) {
		
		
		//Arrays are used to store multiple values in a single variable
		//instead of declaring separate variables for each value.

//To declare an array, define the variable type with square brackets:
		
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		
		//You access an array element by referring to the index number.
		
		System.out.println(cars[0]);

		//This statement accesses the value of the first element in cars:
		
		//Note: Array indexes start with 0: [0] is the first element. 
		//[1] is the second element, etc.
		
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};////To change the value of a specific element
		//refer to the index number:
		
		cars2[0] = "Opel"; 
		System.out.println(cars2[0]);
		
		System.out.println(cars2.length);////To find out how many elements an array has
		//use the length property:
		
		
		//You can loop through the array elements with the for loop
		//and use the length property to specify how many times the loop should run.


		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars3.length; i++) {
		  System.out.println(cars[i]);
		}
		
	
		

		
		}


		
//To create an array of integers, you could write:
		
		int[] num= {1, 2, 3,4};
		
		 
		}
	



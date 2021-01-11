package arrays_exercise2;

public class ArraysProgramExerciseTwo {

	
	public void ArrayTenValues() 
	{
		  int[] numbersArray = new int[10];
		
		 for(int i = 1; i < numbersArray.length; i++) {
			 numbersArray[i] = i;
			 
			 for(int j = 1; j < numbersArray.length; j++)
			   
			     numbersArray[i] =  i * 10;
			
				System.out.println(numbersArray[i]);
		
	     }
		 
	}
	
	
}

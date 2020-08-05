
import java.util.Scanner; //To receive input from user

/**
 * Made by Kurtis Yoder
 * 
 * This program takes two integers from the user
 * and calculates one integer to the power of
 * another
 */


public class RecursivePower 
{
	public static void main(String[] args)
	{
	    //Show program use to user
	    System.out.println("This program will ask the user for two integers" +
				           " in which the first integer will raised" +
				           " to the power of the second integer. " +
				           "The two inputs entered must be integers " +
				           "and greater than zero.");
	    //Receive base input from user
	    Scanner keyboard = new Scanner(System.in); 
	    System.out.println("Enter the integer you wish to be raised to a " +
	    		           "power.");
	    String baseInput = keyboard.nextLine();
	    
	    /*
	     * Check if the base input is an integer 
	     * and if it is greater than zero
	     */
	    boolean flag1 = isIntegerAndAboveZero(baseInput);
	    
	    /*Re-enter the base input if it is not an integer 
	     * and if it is not greater than zero
		 */
		while(flag1 == false)
		{
		    System.out.println("The input you entered does not meet the " +
		    		           "requirements of being an integer and " +
		    		           "greater than 0. Please re-enter " +
		    		           "the base integer.");
		    baseInput  = keyboard.nextLine();
		    
		    flag1 = isIntegerAndAboveZero(baseInput);
			
	    }
	    
	    //Receive exponent input from user
	    System.out.println("Enter the integer you wish to be the exponent" +
			               " to the base integer.");
	    String exponentInput = keyboard.nextLine();
		
	    /*
	     * Check if the exponent input is an integer 
	     * and if it is greater than zero
	     */
		boolean flag2 = isIntegerAndAboveZero(exponentInput);
		
		/*Re-enter the exponent input if it is not an integer and 
		 * if it is not greater than zero
		 */
		while(flag2 == false)
		{
			System.out.println("The input you entered does not meet the " +
					           "requirements of being an integer and " +
					           "greater than 0. Please re-enter " +
					           "the exponent integer.");
		    exponentInput  = keyboard.nextLine();
		    
		    flag2 = isIntegerAndAboveZero(exponentInput);
		}
		
		//Parse the entered strings into integers
		int baseInteger = Integer.parseInt(baseInput);
		int exponentInteger = Integer.parseInt(exponentInput);
		
		//Print out answer to user
		System.out.println("The base " + baseInteger + " " +
				           "to the exponent of " +
				           exponentInteger + " is " + 
				           baseExponent(baseInteger, exponentInteger) + ".");
		
		//Close keyboard Scanner object
		keyboard.close();
	}
    
    
    /**
     * Method to check if the string is numeric or not and if it is numeric
     * whether or not the newly found integer is greater than 0 or not
     * @param str Number entered by user
     * @return boolean to flag whether the string can be type double or not
     * and if the newly found integer is greater than 0
     */
    
    public static boolean isIntegerAndAboveZero(String str)
    {
    	try 
        {  
          int number = Integer.parseInt(str);  
          if(number > 0)
      	  {
      		return true;
      	  }
      	  else
      	  {
      		return false;
      	  }
        } catch(NumberFormatException e)
        {  
          return false;  
        }  
    }
    
    
    /**
     * Recursive method that finds the base integer raised
     * to the power of the exponent integer
     * @param base Base integer
     * @param exponent Exponent integer
     * @return Returns the base integer raised to the power
     * of the exponent integer
     */
    	
    public static int baseExponent(int base, int exponent)
    {
    	if(exponent == 0)
    	{
    		return 1;
    	}
    	else
    	{
    		return base * baseExponent(base, exponent - 1);	
    	}
    		
    
    }

}
	
	
	


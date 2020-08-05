/**
 * Made by Kurtis Yoder
 * 
 * This class is used for creating and using Polynomial objects.
 */


package polynomial;
import java.lang.Math;

public class Polynomial 
{
		private int degree;
		private int[] coefficientsArr;
			
		    /**
	        * Constructor
	        * Initialize instance variables of object
	        */
			public Polynomial(int userDegree) throws InvalidDegreeException
			{
				if(userDegree < 0)
					throw new InvalidDegreeException("The degree you " +
				                                    "entered is not valid.");
				else
				{
					degree = userDegree;
			    	coefficientsArr = new int[userDegree + 1];
				}
			}
			
			/**
	         * Copy Constructor
	         * Create object that will be copied from the object passed
	         * as an argument
	         * @param G Object's attributes will be copied into a new object
	         */
			public Polynomial(Polynomial G)
			{
				degree = G.degree;
				coefficientsArr = new int [G.coefficientsArr.length];
				 for (int i = 0; i < coefficientsArr.length; i++) 
				 {
			         coefficientsArr[i] = G.coefficientsArr[i];
			     }
			}
			
			/**
	         * The setCoefficient method sets the coefficient for the term 
	         * identified by the degree argument
	         * @param deg Identifies the term that is going to have its
	         * coefficient set
	         * @param coeff Sets the coefficient for the term
	         */
			public void setCoefficient(int deg, int coeff) 
					throws InvalidDegreeException
			{
				if(deg < 0 || deg > degree)
					throw new InvalidDegreeException("The degree you " +
				                                    "entered is not valid.");
				else
				{
					coefficientsArr [deg] = coeff;
				}
			}
			
			/**
			 * The evaluate method evaluates the polynomial using the given
			 * argument
			 * @param arg Is equal to x in the polynomial
			 * @return holder The value of the polynomial after being 
			 * evaluated using arg
			 */
			public double evaluate(double arg)
			{
				double holder = 0;
				int i = degree;
				for (int con = degree; con >= 0; con--)
				{
					if(con != 0 && con != 1)
					{
						holder = holder + 
						         (Math.pow(arg, con))*coefficientsArr[i];
					}
					if(con == 1)
					{
						holder = holder + arg*coefficientsArr[i];
					}
					if(con == 0)
					{
						holder = holder + coefficientsArr[i];
					}
					coefficientsArr[i] = coefficientsArr[i--]; 
				}
				return holder;
			}
			
			/**
			 * Compares two Polynomial objects and returns true or false
			 * @param G Polynomial object
			 * @return status Returns true or false based on the attributes of
			 * the two objects being compared
			 */
			public boolean equals(Polynomial G)
			{
				boolean status;
				boolean conditionOne = true; 
				boolean conditionTwo = true;
				boolean conditionThree = true;
				if(degree != G.degree)
				{
					conditionOne = false;
				}
				
				int lenOne = coefficientsArr.length; 
		        int lenTwo = G.coefficientsArr.length; 

		        if (lenOne != lenTwo)
		        {
		        	conditionTwo = false;
		        }
		        
		        for (int i = 0; i < lenOne; i++)
		        {
		            if (coefficientsArr[i] != G.coefficientsArr[i]) 
		            {
		            	conditionThree = false;
		            }
		        }
		        if(conditionOne == false || conditionTwo == false || 
		           conditionThree == false)
		        {
		        	status = false;
		        }
		        else
		        {
		        	status = true;
		        }
		        return status;
			}
			
			/**
	         * Creates a copy of the current Polynomial object
	         * @return copyObj Returns a copy of the current object
	         */
			public Polynomial copy() throws InvalidDegreeException
			{
				Polynomial copyObj = new Polynomial(degree);
				copyObj.coefficientsArr = new int [coefficientsArr.length];
				 for (int i = 0; i < coefficientsArr.length; i++) 
				 {
			         copyObj.coefficientsArr[i] = coefficientsArr[i];
			     }
				 return copyObj;
			}
			
			/**
			 * Returns a polynomial
			 * @return toReturn Holds the polynomial string
			 */
			public String toString()
			{
				String toReturn = "";
				int stLength = 0;
				for (int i = degree; i >= 0; i--)
				{	
					if(coefficientsArr[i] != 0 && i != 0 && i != 1 
					   && i == degree)
					{
						toReturn = toReturn + coefficientsArr[i] + "x" + 
					               "^" + i;
					}
					else if(coefficientsArr[i] != 0 && i != 0 && i != 1)
					{
						if(stLength != 0)
						{
						toReturn = toReturn + " + " + coefficientsArr[i] + 
								   "x" + "^" + i;
						}
						else
						{
						toReturn = toReturn + coefficientsArr[i] + "x" + 
						           "^" + i;
						}
					}
					else if(coefficientsArr[i] != 0 && i == 1 )
					{
						if(stLength != 0)
						{
						toReturn = toReturn + " + " + coefficientsArr[i] + 
						           "x";
						}
						else
						{
						toReturn = toReturn + coefficientsArr[i] + "x";
						}
					}
					else if(coefficientsArr[i] !=0 && i == 0)
					{
						if(stLength != 0)
						{
						toReturn = toReturn + " + " + coefficientsArr[i];
						}
						else
						{
						toReturn = toReturn + coefficientsArr[i];
						}
					}
					stLength = toReturn.length();
				}
				return toReturn;
			}

}


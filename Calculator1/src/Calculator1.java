/**
* Commented on by Kurtis Yoder.
* This program is a calculator that utilizes four operations by receiving
* two numbers from the user then using the operation chosen by the user
* on those two selected numbers.
*/


import java.util.Scanner;

public class Calculator1 
{
    public static void main(String[] args) 
    {
        int option;
        double firstNum, secondNum, result;
        boolean again;
        
        Scanner keyboard = new Scanner(System.in);
        
        displayWelcome();
        
        do
        {
            // Get arithmetic option and validate input
            option = 0;
            while (option < 1 || option > 4)
            {
                option = displayMenu(keyboard);
                if (option < 1 || option > 4)
                    System.out.println("\nERROR! That option is not valid!");
            }
        
            // Get numbers
            System.out.println();
            firstNum = getNumber(keyboard, "first");
            secondNum = getNumber(keyboard, "second");

            // Get arithmetic result
            result = getResult(option, firstNum, secondNum);
        
            // Display result to user
            displayResult(option, firstNum, secondNum, result);
            
            // Does the user want to perform another calculation?
            again = repeat(keyboard);
        }while(again);
        
        System.out.println("\nGoodbye!");
    }
    
    /**
    * This method describes the program to the user.
    */
    
    public static void displayWelcome()
    {
        System.out.println("Welcome to the calculator program!");
        System.out.println("This program will add, subtract,");
        System.out.println("multiply, and divide two numbers.");
    }
    
    /**
     * This method asks the user what math operation they would like to use.
     * @param keyboard Scanner object that receives input from the user. 
     * @return Returns the input put into the Scanner as an integer.
     */
    
    public static int displayMenu(Scanner keyboard)
    {
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Please enter the number of your choice: ");
        return keyboard.nextInt();
    }
    
    /**
     * This method gets the two numbers from the user.
     * @param keyboard This parameter holds the input for the math operation
     * to be used.
     * @param str This parameter holds either "first" or "second".
     * @return Returns the number that the user enters.
     */
    
    public static double getNumber(Scanner keyboard, String str)
    {
        System.out.print("Please enter the " + str + " number: ");
        return keyboard.nextDouble(); 
    }
    
    /**
     * This method adds two numbers.
     * @param numOne The first number put in by the user.
     * @param numTwo The second number put in by the user.
     * @return Returns the value of the two added together.
     */
    
    public static double add(double numOne, double numTwo)
    {
        return numOne + numTwo;
    }
    
    /**
     * This method subtracts the second number from the first number.
     * @param numOne The first number put in by the user.
     * @param numTwo The second number put in by the user.
     * @return Returns the value of the two numbers subtracted.
     */
    
    public static double subtract(double numOne, double numTwo)
    {
        return numOne - numTwo;
    }
    
    /**
     * This method multiplies the first number by the second number.
     * @param numOne The first number put in by the user.
     * @param numTwo The second number put in by the user.
     * @return Returns the value of the two multiplied together.
     */
    
    
    public static double multiply(double numOne, double numTwo)
    {
        return numOne * numTwo;
    }
    
    /**
     * This method divides the first number by the second number.
     * @param numOne The first number put in by the user.
     * @param numTwo The second number put in by the user.
     * @return Returns the value of the two numbers divided.
     */
    

    public static double divide(double numOne, double numTwo)
    {
        return numOne / numTwo;
    }
    
    /**
     * This method gets the result from whichever option the user decided
     * to use for their math operation on the two selected numbers.
     * @param option Parameter that decides which case to use.
     * @param first First number entered by the user.
     * @param second Second number entered by the user.
     * @return Returns the result variable that was obtained from the chosen
     * mathematical operation performed on the two selected numbers.
     */
 
    public static double getResult(int option, double numOne, double numTwo)
    {
        double result = 0;
        switch (option)
        {
            case 1:
                result = add(numOne, numTwo);
                break;
            case 2:
                result = subtract(numOne, numTwo);
                break;
            case 3:
                result = multiply(numOne, numTwo);
                break;
            case 4:
                result = divide(numOne, numTwo);
                break;
        }
        
        return result;
    }
    
    /**
     * Method that outputs to the user the math operations that were used on
     * the numbers selected by the option given by the user.
     * @param option Parameter that decides which case to use.
     * @param first First number entered by the user.
     * @param second Second number entered by the user.
     * @param result Result that was obtained from the previous method's
     * math operations on the two selected numbers.
     */
    
    public static void displayResult(int option, double first, 
                                     double second, double result)
    {
        System.out.println("");
        switch (option)
        {
            case 1:
                System.out.print(first + " + " + second + " = ");
                break;
            case 2:
                System.out.print(first + " - " + second + " = ");
                break;
            case 3:
                System.out.print(first + " * " + second + " = ");
                break;
            case 4:
                System.out.print(first + " / " + second + " = ");
                break;
        }
        
        System.out.printf("%.3f\n", result);
    }
    
    /**
     * Method that asks whether the user wants to use the calculator program
     * again.
     * @param keyboard Scanner object that holds the user input.
     * @return Returns true if the user enters "Y" or "y", and 
     * returns false if the user enters anything else.
     */
    
    public static boolean repeat(Scanner keyboard)
    {
        System.out.print("\nWould you like to perform another " +
                         "calculation? (y or n)");
        keyboard.nextLine();
        String input = keyboard.nextLine();
        char again = input.charAt(0);
        
        if (again == 'y' || again == 'Y')
            return true;
        else
            return false;
    }
}

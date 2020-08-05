import java.io.*;           //For File class and FileNotFoundException
import java.util.Scanner;   //For Scanner class

/**
 * Made by Kurtis Yoder
 * This program solves equations entered by the user
 * then writes the equation and its solution
 *  to a user chosen file. Exceptions are handled.
 */

public class MathSolver1 {

    public static void main(String[] args) throws IOException
    {
        //To hold user equation
        String equation;
        //Holds answer to equation
        double answer;
        //Holds true or false for flagging
        boolean contin = true;
        
        //Create a Scanner object for keyboad input
        Scanner keyboard = new Scanner(System.in);
        //Get file name
        System.out.println("Enter the name of a file:  ");
        String filename = keyboard.nextLine();
        //Attempt to open file, thus detecting whether it exist or not
        Scanner inputFile = openFile(filename);
        
        //Loop to force user to enter existing file
        while(inputFile == null)
        {
            System.out.print("Error: " + filename + 
                             " does not exist\nPlease enter another name: ");
            filename = keyboard.nextLine();
            //Checking if file exists
            inputFile = openFile(filename);
        }
        
        //Loop taking in equations from user until they wish to stop
        while(contin == true)
        { 
            //Explaining parameters to user
            System.out.println("Enter an equation you wish to be solved.\n" +
                               "The equation is limited to <operand>" +
                               " <operator> <operand>.\nThe operands need " +
                               "to be valid numbers and the operator can " +
                               "can only be +,-,*,/,%. \nIf you do not " +
                               "enter " +
                               "the equation as exactly as shown above " +
                               "then the program will just skip over that " +
                               "entry until you offer one entered as " +
                               "instructed.\nThe program will keep on " +
                               "asking for equations until you decide to " +
                               "quit by entering 0 / 0.");
            //Receiving answer from user
            equation = keyboard.nextLine();
            //Tokenizing equation
            String delims = "[ ]";
            String[] tokens = equation.split(delims);
            //Non valid entry if array is length is less than 2
            if(tokens.length != 1 && tokens.length != 2)
            {
                //If entry is 0 / 0 then kick out of loop
                if (tokens[1].equals("/") && tokens[2].equals("0") 
                    && tokens[0].equals("0"))
                {
                    contin = false;
                }
                else
                {
                    contin = true;
                }
                //Check if equation is entered correctly, else retry
                if(isNumeric(tokens[0]) && isNumeric(tokens[2]) && 
                   tokens.length == 3 && contin == true &&
                  (tokens[1].charAt(0) == 43 || tokens[1].charAt(0) == 45 || 
                   tokens[1].charAt(0) == 47 || tokens[1].charAt(0) == 42 ||
                   tokens[1].charAt(0) == 37))
                {
                    //Equation by +
                    if(tokens[1].equals("+"))
                    {
                        answer = Double.parseDouble(tokens[0]) 
                                + Double.parseDouble(tokens[2]);
                        //Make sure file still exists
                        if(checkFile(filename))
                        {
                        //Print out equation and solution to chosen file
                        FileWriter fileWriter = 
                                new FileWriter(filename, true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println("\n" + tokens[0] + " + " + 
                                            tokens[2] + " = " + answer);
                        printWriter.close();
                        }
                    }
                    //Equation by -
                    else if(tokens[1].equals("-"))
                    {
                        answer = Double.parseDouble(tokens[0]) 
                                - Double.parseDouble(tokens[2]);
                        //Make sure file still exists
                        if(checkFile(filename))
                        {
                        //Print out equation and solution to chosen file
                        FileWriter fileWriter = 
                                new FileWriter(filename, true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println("\n" + tokens[0] + " - " + 
                                            tokens[2] + " = " + answer);
                        printWriter.close();
                        }
       
                    }
                    //Equation by *
                    else if(tokens[1].equals("*"))
                    {
                        answer = Double.parseDouble(tokens[0]) 
                                * Double.parseDouble(tokens[2]);
                        //Make sure file sill exists
                        if(checkFile(filename))
                        {
                        //Print out equation and solution to chosen file
                        FileWriter fileWriter = 
                                new FileWriter(filename, true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println("\n" + tokens[0] + " * " + 
                                            tokens[2] + " = " + answer);
                        printWriter.close();
                        }
                    }
                    //Equation by /
                    else if(tokens[1].equals("/"))
                    {
                        answer = Double.parseDouble(tokens[0]) 
                                / Double.parseDouble(tokens[2]);
                        //Make sure file still exists
                        if(checkFile(filename))
                        {
                        //Print out equation and solution to chosen file
                        FileWriter fileWriter = 
                                new FileWriter(filename, true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println("\n" + tokens[0] + " / " + 
                                            tokens[2] + 
                                            " = " + answer);
                        printWriter.close();
                        }
                    }
                    //Equation by %
                    else if(tokens[1].equals("%"))
                    {
                        answer = Double.parseDouble(tokens[0]) 
                                % Double.parseDouble(tokens[2]);
                        //Make sure file still exists
                        if(checkFile(filename))
                        {
                        //Print out equation and solution to chosen file
                        FileWriter fileWriter = 
                                new FileWriter(filename, true);
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.println("\n" + tokens[0] + " % " + 
                                             tokens[2] + " = " + answer);
                        printWriter.close();
                        }
                    }
               
                }
    
            }
                
        }
        
      System.out.println("Thanks for trying out this Math Solver!"); 
      keyboard.close();
    }
    
    
    
    /**
     * Method to check if file exists
     * @param filename File chosen by user
     * @return Scanner input Return to see if input contains anything
     */
    public static Scanner openFile (String filename)
    {
        Scanner input;
        
        //Try to open file
        try 
        {
            File file = new File(filename);
            input = new Scanner(file);
        }
        catch(FileNotFoundException e)
        {
            input = null;
        }
      
        
        return input;
        
    }
    
    /**
     * Check to see if file exists
     * @param filename File chosen by user
     * @return boolean check to flag if the file still exists or not
     */
    
    public static boolean checkFile (String filename)
    {
        boolean check;
        Scanner inputCheck;
        
        
        //Try to open file
        try 
        {
            File file = new File(filename);
            inputCheck = new Scanner(file);
            check = true;
            inputCheck.close();
        }
        catch(FileNotFoundException e)
        {
            check = false;
        }
      
        
        return check;
    }
    
    /**
     * Method to check if the string is numeric or not
     * @param str Equation entered by user
     * @return boolean to flag whether the string can be type double or not
     */
    
    public static boolean isNumeric(String str) 
    { 
        try 
        {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e)
        {  
          return false;  
        }  
    }

}
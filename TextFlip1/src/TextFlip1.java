import java.util.Scanner;//Needed for Scanner class
import java.io.*;  //Needed for file

/**
 * The purpose of this program is to reverse lines of text
 * read in from a file.
 * Made by Kurtis Yoder
 */

public class TextFlip1 
{

    public static void main(String[] args) throws IOException
    {
        //Get file name
        String filename = getFile();
        
        //Open file for reading
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        //New file name for reversed line output
        PrintWriter fileOut = new PrintWriter ("reverse.txt");
        
        //Read each file line
        while (inputFile.hasNext()) 
        {
            String line = inputFile.nextLine();
            //Reverses line of text
            fileOut.println(revString(line));
            
        }  
        
        fileOut.close();
        inputFile.close();
        
        
    }
    
    
    /**
     * The getFile method gets a file name from the user
     * @return filename file name from user
     */
    
    public static String getFile()
    {
    //Create a Scanner object for keyboad input
    Scanner keyboard = new Scanner(System.in);
    //Get file name
    System.out.println("Enter the name of a file:  ");
    String filename = keyboard.nextLine();
    keyboard.close();
    //Return file name
    return filename;
    }
    
    /**
     * The revString method reverses a line of text from the file entered
     * @param line line of text from the entered file
     * @return lineArray original line of text with the characters reversed
     */
    
    public static String revString(String line)
    {
          
            //Create a character array
            //Initialize it with the string from user
            char[] lineArray = line.toCharArray();
            
            //Swap the first and last characters of the line
            for (int index = 0, lineLength = line.length() - 1; 
                    index < lineLength; index++, lineLength--)
            {
                char lineCharacter = lineArray[index];
                lineArray[index] = lineArray[lineLength];
                lineArray[lineLength] = lineCharacter;
            }
     
            // Convert the character array to a string and return
            return String.valueOf(lineArray);
        }
    }
    


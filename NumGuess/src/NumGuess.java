
/**
Written by Kurtis Yoder
This program allows a user to name a range of integers
then guess for the randomized number created by the program 10 times
*/

import java.util.Random;
import javax.swing.JOptionPane;


public class NumGuess 
{

    public static void main(String[] args) 
    {
        //Display a greeting to the user
        JOptionPane.showMessageDialog(null, "This program allows you to" +
                                     " input a range of numbers from 1" +
                                     " to whatever number you choose." +
                                     " Then the program finds a random" +
                                     " number within that range and allows" +
                                     " you to guess 10 times for the random" +
                                     " number.");
        
        //Create counter for Do-While Loop
        String answ;
        
        //Use Do-While Loop to loop game
        do
        {
            //Get max integer from user
            int maxValue;
            String strang;
            strang = JOptionPane.showInputDialog("Input a max value" +
                                               " for your range of integers.");
            maxValue = Integer.parseInt(strang);
        
            //Validation loop for max range of integers
            while (maxValue<10 || maxValue>1000)
            {
                JOptionPane.showMessageDialog(null, "You did not enter a max" +
                                         " integer that is fit for use." +
                                         " Please re-enter an integer.");
                strang = JOptionPane.showInputDialog("Input a max value for" +
                                                " your range of integers.");
                maxValue = Integer.parseInt(strang);
            }
          
            //Variables used in for loop
            int count;
            int number = 0;
            int guessNumber = 0;
            Random randomNumbers = new Random();
            number = randomNumbers.nextInt(maxValue) + 1;
            //Loop to go through game 10 times
            for (count = 1; count <= 10; count++)
            {
                strang = JOptionPane.showInputDialog("Guess what the random" +
                                                    " number is.");
                guessNumber = Integer.parseInt(strang);
                //Check whether the number guessed is correct, too high,
                //or too low
                if (guessNumber==number)
                {
                    JOptionPane.showMessageDialog(null, "You guessed the" +
                                                 " correct number!");
                    count = 100;
                }
                else if (guessNumber>number)
                {
                    JOptionPane.showMessageDialog(null, "The guess you" +
                                                 " entered is too high!");
                }
                else if (guessNumber<number)
                {
                    JOptionPane.showMessageDialog(null, "The guess you" +
                                                 " entered is too low!");
                }
            }
            //Let user know about how the game went then
            //ask if they want to play again
            if (guessNumber!=number)
            {
                JOptionPane.showMessageDialog(null, "You have run out" + 
                                             " of guesses." +
                                             " Would you like to" +
                                             " try again?");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Congrats, you have" +
                                         " guessed the number." +
                                         " Would like to try again?");
            }
            //Ask user if they want to play again
            answ = JOptionPane.showInputDialog("Answer Y for yes or N for no");
        } while (answ.equals("Y") || answ.equals("y"));
    }
}

/**
 * Made by Kurtis Yoder
 * 
 * This class is used for throwing exceptions involving
 * invalid degrees being entered. 
 */


package polynomial;
@SuppressWarnings("serial")
public class InvalidDegreeException extends Exception
{
	 /**
     * No-Arg Constructor
     * Throws exception with no message
     */ 
	  public InvalidDegreeException()
	  {
	    super();
	  }
	 
	  /**
       * Constructor
       * Throws exception with a specified message
       */
	  public InvalidDegreeException(String message)
	  {
	    super(message);
	  }
}

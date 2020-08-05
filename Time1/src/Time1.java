
/**
Written by Kurtis Yoder

This class receives a time from the user, then adds the amount
of hours and minutes entered again by the user to that time. 
The new time can then be seen by the user.
*/

public class Time1 {
    
    private int hour;
    private int minutes;
    
    /**
    No-Arg Constructor
    
    Intializing the class fields of hour and minutes
    */
    
    public Time1()
    {
        hour = 0;
        minutes = 0;
    }
    
    /**
    Constructor that receives the time entered by the user
    @param h Amount of hours
    @param m Amount of minutes
    */

    public Time1(int h, int m)
    {
        if (h>=1 && h<=12)
        {
            hour = h;
        }
        else
        {
            hour = 0;
        }
        if (m>=0 && m<=59)
        {
            minutes = m;
        }
        else
        {
            minutes= 0;
        }
    }
        
    /**
    The getHour method returns a Time
    object's hour.
    @return The value in the hour field.
    */
        
    public int getHour()
    {
        return hour;
    }
    
    /**
    The getMinutes method returns a Time
    object's minutes.
    @return The value in the minutes field.
    */
        
    public int getMinutes()
    {
        return minutes;
    }
    
    /**
    The advanceHour method adds hours to the hour field
    previously entered by the user.
    @param h Amount of hours to add to the hour field.
    */
    
    public void advanceHour(int h)
    {
        int countHour;
        for (countHour = 1; countHour<=h; countHour++)
        {
            if (hour<12)
            {
                hour += 1;
            }
            else if (hour>=12)
            {
                hour = 0;
                hour += 1;
            }
                
        }
    }
    
    /**
    The advanceMinutes method adds minutes to the minutes field
    previously entered by the user.
    @param m Amount of minutes to add to the minutes field.
    */
    
    public void advanceMinutes(int m)
    {
        int countMinutes;
        for (countMinutes = 1; countMinutes<=m; countMinutes++)
        {
            if (minutes<59)
            {
                minutes += 1;
            }
            else if (minutes>=59)
            {
                minutes = -1;
                minutes += 1;
                hour += 1;
            }
        }
    }
}

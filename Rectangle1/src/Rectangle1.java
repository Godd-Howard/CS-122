public class Rectangle1
{
    private double length;
    private double width;

    /**
     *  Constructor
     *  @param len The length of the rectangle.
     *  @param w The width of the rectangle.
     */
    
    public Rectangle1(double len, double w)
    {
        length = len;
        width = w;
    }

    /**
     *  Copy Constructor
     *  @param rec The Rectangle object to copy.
     */
    
    public Rectangle1(Rectangle1 rec)
    {
        length = rec.length;
        width = rec.width;
    }

    /**
     * The setLength method stores a value in the
     * length field.
     * @param len The value to store in length.
     */

    public void setLength(double len)
    {
        length = len;
    }

    /**
     *  The setWidth method stores a value in the
     *  width field.
     *  @param w The value to store in width.
     */

    public void setWidth(double w)
    {
        width = w;
    }

    /**
     *  The getLength method returns a Rectangle
     *  object's length.
     *  @return The value in the length field.
     */

    public double getLength()
    {
        return length;
    }

    /**
     *  The getWidth method returns a Rectangle
     *  object's width.
     *  @return The value in the width field.
     */
   
    public double getWidth()
    {
        return width;
    }

    /**
     *  The getArea method returns a Rectangle
     *  object's area.
     *  @return The product of length times width.
     */

    public double getArea()
    {
        return length * width;
    }

    /**
     *  The equals method returns whether a Rectangle
     *  object equals another Rectangle object.
     *  @param rec A Rectangle object to compare.
     *  @return Whether the two Rectangle objects are equal.
     */

    public boolean equals(Rectangle1 rec)
    {
        if (length == rec.length && width == rec.width)
            return true;
        else
            return false;
    }

    /**
     *  The copys method returns a copy of 
     *  a Rectangle object.
     *  @return A copy of the Rectangle object.
     */

    public Rectangle1 copy()
    {
        return new Rectangle1 (length, width);
    }

    /**
     *  The getArea method returns a Rectangle
     *  object's area.
     *  @return The product of length times width.
     */

    public String toString()
    {
        return "length: " + length + 
               "\nwidth: " + width;
    }
}




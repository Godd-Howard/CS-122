
public class Cont1 {

    public static void main(String[] args) 
    {
       Time1 Box = new Time1(-6, 14);
       Box.advanceHour(246);
       Box.advanceMinutes(62);
       System.out.println(Box.getHour());
       System.out.println(Box.getMinutes());

    }

}

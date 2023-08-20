import java.util.*;
public class calender
{
    public static void main()
    {
            
        Calendar c=Calendar.getInstance();
        System.out.println("TODAY IS "+(c.get(Calendar.DATE))+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
    }
}

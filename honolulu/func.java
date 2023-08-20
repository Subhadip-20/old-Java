package honolulu;
import java.util.*;

public class func
{
    public static void main(String args[])
    {
         //a for apuu rege gele mukh ta misti lage
        int n=args.length;
        int count=0;
        String b="madam";
        String s="hii";
        String m="";
        System.out.println("the size of the string is "+ s.length());
        System.out.println("Original string is "+ b);
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            m=ch+m;
        }
                System.out.println("the string m is "+m);

        if(b.equals(m))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println(" Not Pallindrome");
        }
    }
}

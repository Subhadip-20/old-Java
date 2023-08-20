package honolulu;
import java.util.*;
public class StringFunction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int uc=0,lc=0,space=0,d=0;
        String s="Today is Monday";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uc++;
            }
            if(Character.isLowerCase(ch)) 
            {
                lc++;
            }
            if(Character.isDigit(ch))
            {
                d++;
            }
            if(Character.isWhitespace(ch)) 
            {
                space++;
            }
            System.out.println(Character.toLowerCase(ch));
            System.out.println(Character.toUpperCase(ch));
        }
        
        s=s.toUpperCase();
        s=s.toLowerCase();
        
        
        System.out.println("the original String is  "+ s);
        System.out.println("the number of Uppeer Case character in String is  "+ uc);
        System.out.println("the number of Lower Case character in String is  "+ lc);
        System.out.println("the number of space in String is  "+ space);
    }
}

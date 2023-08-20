import java.util.*;
public class special
{
    public static void main()
    {
        String g="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD TO CHECK FOR SPECIAL OR PALINDROME WORD");
        String s= sc.nextLine();
        if(s.charAt(0)==s.charAt(s.length()-1))
        {
            
            for(int i=0; i<s.length(); i++)
            {
                char ch=s.charAt(i);
                g=ch+g;
            }
            
            if(g.equals(s))
            {
                System.out.println("IT IS A PALLINDROME WORD WHICH IS ALSO A SPECIAL WORD");
            }
            else
            {
                System.out.println("ONLY A SPECIAL WORD");
            }
        }
        
        else
        {
            System.out.println("NOT A PALLINDROME OR A SPECIAL WORD");
        }
            
    }

}

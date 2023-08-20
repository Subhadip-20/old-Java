import java.util.*;
public class dd
{static String f="";
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE WORD");
     String s=sc.nextLine();
     int l=s.length();
     String q=p(s,0);
     System.out.println(q);
     
 }
 static String p(String g,int i)
 {
     
     if(i==g.length())
     return f;
     else
     {
         char ch=g.charAt(i);
         f=ch+f;
         return p(g,++i);
        }
    }
}
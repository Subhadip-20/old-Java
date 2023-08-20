import java.util.*;
public class r
{static String f="";
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE WORD");
     String s=sc.nextLine();
     int l=s.length()-1;
    String q=p(s,l);
    System.out.println(q);
     
 }
 static String p(String g,int i)
 {
     if(i>=0)
     {char ch=g.charAt(i);
      f=f+ch;
       return p(g,--i);}
       else
       return f;
    }
}


import java.util.*;
public class AR
{
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
   System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the encryption value");
    int i=sc.nextInt();
     
    int t=str.length();
    for (int j=0;j<t;j++)
    {
    char c=str.charAt(j);
    int d= c;
    if(d-i+1>=65)
    {int f=d-(i-1);
    char l=(char)f;
    System.out.print(l);}
     else if(d-i<65){
    int f=d+26-(i-1);
    char l=(char)f;
    System.out.print(l);}
    
    }
    }
}

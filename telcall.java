import java.util.*;
public class telcall
{
   static int phono,n;
   static double amt=0;
   static String name;
    telcall()
    {
        phono=n=0;
        name="";
    }
    
   telcall(int x, String y, int k)
   {
       phono=x;
       n=k;
       name=y;
 }
 static void compute()
 {
     if(n>=1&&n<=100)
     {
         amt=500;
        
      }
       if(n>=101&&n<=200)
     {
         amt=n*1+500;
        
      }
       if(n>=201&&n<=300)
     {
         amt=n*1.2+500;
        
      }
      if(n>300)
     {
         amt=n*1.50+500;
        
      }
    
 }
 static void  display()
 {
     System.out.println("NUMBER\tNAME\tTOTAL CALL\tAMOUNT");
     System.out.println(phono+"\t"+name+"\t"+n+"\t"+amt);
 }
 public static void main()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE NUMBER, NAME AND NUMBER OF CALL MADE");
     phono=sc.nextInt();
     name=sc.next();
     n=sc.nextInt();
     telcall obj=new telcall(phono,name,n);
     obj.compute();
     obj.display();
     phono=n=0;
        name="";
     
 }
}
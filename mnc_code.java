import java.util.*;
public class mnc_code
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n=sc.nextInt();
       
       for(int i=0;i<=n;i++)
       {
           boolean k=retu(i);
           if(k==true)
           {System.out.print(i+",");}
       }
   }
   public static boolean retu(int l)
   {
       if(l==0||l==1||l==2||l==3||l==4||l==5||l==6||l==7||l==8||l==9)
       return true;
       if(l>9)
       {
           String k=Integer.toString(l);
           boolean c=false;
           for(int i=0;i<k.length()-1;i++)
           {
               int p=Integer.parseInt(String.valueOf(k.charAt(i)));
               int q=Integer.parseInt(String.valueOf(k.charAt(i+1)));
               if(Math.abs(p-q)==1.0)
               {
                   c=true;
               }
               else
               {
               c=false;
               break;
            }
               
           }
           return c;
       }
       else return false;
   }
}

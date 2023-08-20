import java.util.*;
public class sm
{
   public static void main(String arg[])
   {
       int max,smax,f=0;
       smax=max=Integer.parseInt(arg[0]);
       
       if(arg.length==1)
       {
           System.out.println("not possible");
           System.exit(0);
        }
       for(int i=1;i<arg.length;i++)
       {
           if(Integer.parseInt(arg[i])>max)
           {
               smax=max;
               max=Integer.parseInt(arg[i]);
           }
           if(Integer.parseInt(arg[i])!=Integer.parseInt(arg[i-1]))
           f=1;
       }
       if (f==0)
       {System.out.println("not possible");
        System.exit(0);}
       System.out.println(smax);
      
   }
}

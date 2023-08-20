import java.util.*;
public class fun
{
    public static void main(int l)
    {
        fun ob=new fun();
        ob.func(l);
        
        
    }
   void func(int x)
    {int s=0;String g="";int k=1;
       while(k<50)
        {
            int l=0;
            for(int j=1;j<=(x+1);j++)
            {
                if((x+1)%j==0)
                {
                    l++;
                }
            }
            if(l==2)
            {
                
                g=g+"  "+(x+1);
                k++;
                
            }
           
            x++;
        }
        System.out.println(g);
       
    }
}

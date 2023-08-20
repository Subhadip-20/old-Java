import java.util.*;
public class Mix
{
    String wrd;
    int len;
    
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        Scanner sc=new Scanner(System.in);
        wrd=sc.nextLine();
        wrd=wrd.toUpperCase();
    }
    void display()
    {
        System.out.println(wrd);
    }
    void mix_word(Mix P,Mix Q)
    {
        if(P.wrd.length()>Q.wrd.length())
        {
            len=P.wrd.length();
        }
        else
        len=Q.wrd.length();
        int k=0;
        for(int i=0;i<len;i++)
        {
            if(P.wrd.length()>Q.wrd.length())
        {
            if(k<Q.wrd.length())
            {
                wrd=wrd+P.wrd.charAt(i)+""+Q.wrd.charAt(k);
                k++;
             }
             else
            {
                wrd=wrd+P.wrd.charAt(i);
            }
         }
         if(P.wrd.length()==Q.wrd.length())
        {
            
                wrd=wrd+P.wrd.charAt(i)+""+Q.wrd.charAt(i);
                
           }
         else
        {
             if(k<P.wrd.length())
            {
                wrd=wrd+P.wrd.charAt(i)+""+Q.wrd.charAt(k);
                k++;
            }
         else
            {
                wrd=wrd+Q.wrd.charAt(i);
            }
        }
        }
    }
    public static void main()
    {
        Mix ob1=new Mix();
        Mix ob2=new Mix();
        Mix ob3=new Mix();
        System.out.println("Enter the First word:");
        ob1.feedword();
        System.out.println("Enter the Second word:");
        ob2.feedword();
        ob3.mix_word(ob1,ob2);
        System.out.println("Output:");
        ob3.display();
    }
}
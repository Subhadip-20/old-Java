import java.util.*;
public class string
{
    String str,rev;
    string()
    {
        str=rev="";        
    }
    void inputstring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        str=sc.nextLine();
        str=str.toUpperCase();
        
    }
    void getprocess()
    {
        for (int i=0;i<str.length();i++)
        {char c= str.charAt(i);
            rev=c+rev;
        }
        System.out.println();
        System.out.println("REVERSE IS "+rev);
         System.out.println();
    }
    void getcalculate()
    {int x=0,f=0,c=0,s=0;
        str=str+" ";
        for (int i=0;i<str.length();i++)
        {   char ch=str.charAt(i);
            if(ch==' ')
            x++;
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            f++;
            if(Character.isLetter(ch)&&(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'))
            {
                c++;
            }
        }
        System.out.println("number of word "+x);
        System.out.println();
         System.out.println("number of vowel "+f);
         System.out.println();
          System.out.println("number of consonant "+c);
          System.out.println();
        for (char d='A';d<='Z';d++)
        {s=0;
            for (int i=0;i<str.length();i++)
        { 
           char cd=str.charAt(i);
           if(cd==d)
           {
               s++;
            }
           
        }
        if(s!=0)
        {
        System.out.println("frequency of "+d+" is "+s);
        System.out.println();
    }
    }
}
public void main()
{
    string ob=new string();
    ob.inputstring();
    ob.getprocess();
   
    ob.getcalculate();
    
    
}
}

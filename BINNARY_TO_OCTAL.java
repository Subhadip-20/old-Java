import java.util.*;
class BINNARY_TO_OCTAL
{ public static void main()
  { Scanner sc= new Scanner (System.in);
    System.out.println("enter a number");
    String str=sc.nextLine();
    String arr[]={"000","001","010","011","100","101","110","111"};
    if(str.length()%3!=0)
    {   if (str.length()%3==2)
        str="0".concat(str); 
        else 
        str="00".concat(str);
    } 
    System.out.println(str);
    String sub="";int s=0;
    for ( int i=3;i<=str.length();i=i+3)
    { sub=str.substring(s,i);
        s=i;
       for (int j=0;j<=7;j++)
       { if (sub.equals(arr[j]))
           { System.out.print(j+"");
           }
          else 
          continue ; 
       }
    }
    sc.close();
}
}   
    


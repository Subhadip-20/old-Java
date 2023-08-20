import java.io.*;
public class timee
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter the 2 number");
        int a=Integer.parseInt(br.readLine());
        String arr[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
        String brr[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eigteen","Nineteen","Twenty","Twenty One","Twenty Two","Twenty Three","Twenty Four","Twenty Five","Twenty Six","Twenty Seven","Twenty Eight","Twenty Nine"};
        if((a>=1&&a<=12)==false)
        {
            System.exit(0);
        }
        int b=Integer.parseInt(br.readLine());
        if((b>=0&&b<=59)==false)
        {
            System.exit(0);
        }
        if(b==0)
        
        System.out.print(a+":"+b+"\t"+arr[a-1]+" O' clock");
        if(b==15)
        System.out.print(a+":"+b+"\t"+"Quarter past "+arr[a-1]);
        if(b==30)
        System.out.print(a+":"+b+"\t"+"Half past "+arr[a-1]);
        if(b==45)
        {
            if(a==12)
            System.out.print(a+":"+b+"\tQuarter to One");
            else
            System.out.print(a+":"+b+"\t"+"Quarter to "+arr[a]);
        }
        if(b>0&&b<30&&b!=15)
        System.out.print(a+":"+b+"\t"+brr[b-1]+" minutes past "+arr[a-1]);
        if(b>30&&b<60&&b!=45)
        {
            if(a==12)
         System.out.print(a+":"+b+"\t"+brr[(60-b)-1]+" minutes to One");
         else
         System.out.print(a+":"+b+"\t"+brr[(60-b)-1]+" minutes to "+arr[a]);
    }
}
}

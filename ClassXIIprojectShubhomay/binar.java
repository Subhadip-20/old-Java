/*program coded by Shubhomay Kundu Poddar
 program to update a binary file and calculate the total marks obtained by 'n' number of students
 */
import java.io.*;
import java.util.*;
class binar
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream ob=new DataOutputStream(new FileOutputStream("E:\\mark.dat",false));
        System.out.println("Enter the number of students");
        int n=sc.nextInt();//taking number input of number of students
        for(int i=0;i<n;i++)
        {
            //taking input of details of student
            System.out.println("Enter the roll number");
            String r1=br.readLine();
            System.out.println("Enter the name");
            String nm=br.readLine();
            System.out.println("Enter the marks of 1st subject");
            String s1=br.readLine();
            System.out.println("Enter the marks of 2nd subject");
            String s2=br.readLine();
            System.out.println("Enter the marks of 3rd subject");
            String s3=br.readLine();
            ob.writeBytes(r1+"  "+nm+"  "+s1+" "+s2+" "+s3+"\n");
            
        }
        
        DataInputStream ob1=new DataInputStream(new FileInputStream("E:\\mark.dat"));
        String l;int marks=0;
        System.out.println("roll \t name \t marks in subject1 \t marks in subject2 \t marks in subject3 \t total");  
        while((l=ob1.readLine())!=null)
        {
            //reading the lines chracterwise
            int x=0,ss1=0,ss2=0,ss3=0;String g="",q="";
            for(int i=0;i<l.length();i++)
            {
                char ch=l.charAt(i);
                if(ch==' ')
                {
                    x++;
                
                if(x==3)
                {
                    q=l.substring(0,i);
                    g=l.substring(i+2);
                
                for(int j=0;j<g.length();j++)
                {
                    ss1=Integer.parseInt(g.substring(0,2));
                    ss2=Integer.parseInt(g.substring(3,5));
                    ss3=Integer.parseInt(g.substring(6));
                    marks=ss1+ss2+ss3;
                    break;
                }}
            }
            }
            //printing the details of student
            System.out.println(q+"\t \t"+ss1+"\t \t"+ss2+"\t \t"+ss3+"\t \t"+marks);
            
        }
    }
}

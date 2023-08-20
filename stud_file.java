import java.io.*;
public class stud_file
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter("Student.txt",false);
        int r[]=new int[10];
        String n[]=new String[10];
        String g[]=new String[10];
        String l[]=new String[10];
        int m1[]=new int[10];
        int m2[]=new int[10];
        int m3[]=new int[10];
        int m4[]=new int[10];
        int m5[]=new int[10];
        int t[]=new int[10];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the roll no. ,name,marks of 5 subjects of student "+(i+1));
            r[i]=Integer.parseInt(br.readLine());
            n[i]=br.readLine();
            m1[i]=Integer.parseInt(br.readLine());
            m2[i]=Integer.parseInt(br.readLine());
            m3[i]=Integer.parseInt(br.readLine());
            m4[i]=Integer.parseInt(br.readLine());
            m5[i]=Integer.parseInt(br.readLine());
            t[i]=(m1[i]+m2[i]+m3[i]+m4[i]+m5[i])/5;
            if((t[i])>90)
            g[i]="A";
            else if(t[i]>80&&t[i]<=90)
            g[i]="B";
            else if(t[i]>70&&t[i]<=80)
            g[i]="C";
            else if(t[i]>60&&t[i]<=70)
            g[i]="D";
            else
            g[i]="F";
            l[i]=r[i]+" "+n[i]+" "+m1[i]+" "+m2[i]+" "+m2[i]+" "+m3[i]+" "+m4[i]+" "+m5[i]+" "+t[i]+" "+g[i]+"\n";
            fw.write(l[i]);
            System.out.println(g[i]+" "+t[i]);
        }
        fw.close();
    }
}
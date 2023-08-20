import java.io.*;
public class vow
{
    char g[]={'A','E','I','O','U'};
    int stuart(String a)
    {
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            for(int j=1;j<6;j++)
            if(ch!=g[j])
            {
            }
            
        }
        return 5;
    }
    int kevin(String b)
    {
        return 5;
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        vow ob=new vow();
        int i=ob.stuart(s);
        int j=ob.kevin(s);
    }
}

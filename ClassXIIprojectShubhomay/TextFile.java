/*program coded by Shubhomay Kundu Poddar
 program to read the text file created and print number of words and vowels in each sentence
 */
import java.io.*; 
import java.util.*;  
public class TextFile   
{  
    public static void main(String[] args) throws Exception 
    {  
        String line;  
        int count = 0;  
        Scanner sc=new Scanner(System.in);
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter("E:\\TEXT.txt"); 
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();//taking no. of sentences to be entered
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+". ");
            String s=b.readLine();
            fw.write(s+"\n");
            System.out.println();
            
        }
        fw.close();
        FileReader file = new FileReader("E:\\TEXT.txt");  
        BufferedReader br = new BufferedReader(file);  
        System.out.println("line \t number of words \t number of vowels");
        //
        while((line = br.readLine()) != null) 
        {  
            //reading lines word wise
            StringTokenizer st=new StringTokenizer(line);
            int k=st.countTokens();
            int p=0;
            for(int i=0;i<line.length();i++)
            {
                char ch=line.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    p++;
                }
            }
            System.out.println(line+"            "+k+"                           "+p);
        }  
          
        
    }  
}  
import java.io.*;
public class Decode
{   
    public static void main(String args[])throws IOException
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Coded Text : "); // inputting coded text
        String s = br.readLine();
        int l = s.length();
        s = s.toUpperCase(); // converting the coded text into Uppercase
        s = s + " "; // adding a space at the end
 
        if(l>=100) // checking whether length of input code is less than 100
            System.out.println("!!! Invalid Length of Coded Text !!!");
 
        else
        {
            System.out.print("Enter the Shift Value : ");
            int shift = Integer.parseInt(br.readLine());
 
            if(shift<1 || shift>26) // checking whether shift value is between 1 and 26
                System.out.println("!!! Invalid Shift Value !!!");
 
            else
            {
                int a, b;
                char ch1, ch2;
                String dec=""; //new String for storing the decoded text
                 
                for(int i=0; i<l; i++)
                {
                    ch1 = s.charAt(i); // extracting characters one by one
                    ch2 = s.charAt(i+1); // extracting the next character
 
                    /* Below we are adding shift value to the characters
                     * if ch1 = 'A' and shift = 7,
                     * then ch1 + shift - 1 will give us: 'A'+7-1 = 65+7-1 = 71
                     * which is the ASCII value of 'G'
                     */
                    a = ch1 + shift - 1; // storing ASCII values after adding shift to the current character
                    b = ch2 + shift - 1; // storing ASCII values after adding shift to the next character
 
                    
                    if((char)a == 'Q' && (char)b == 'Q')
                    {
                        a = 32;
                        i++;
                    }
 
                    /* If ASCII value after adding the shift becomes more than 90,
                     * then we subtract 26 from it, to make it circular,
                     * eg. 'U'+7-1 = 85+7-1 = 91, but we want 'A' whose ASCII value is 65
                     * so 91-26 will give us 65
                     */
                    if(a>90)
                        a = a - 26;
                    if(ch1 != ' ')
                        dec = dec + (char)a; // finally adding the decoded character to the new String
                }
            System.out.println("Decoded Text : "+dec);
            } } } } //end of class


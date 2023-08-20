import java.io.*;
class encodecoding
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);   
BufferedReader br=new BufferedReader(read);
System.out.println("Enter  E  for encoding\nEnter  D  for decoding");
                     
char a=br.readLine().charAt(0);

switch(a)
{
case 'E':
//case for encoding a message
System.out.println("Enter the message to be encoded");
String ec=br.readLine();
System.out.println("Decoded message");
 for(int i=0;i<ec.length();i++)
{
char ch=ec.charAt(i);
int asc=(int)ch;
if((asc>=65)&&(asc<=90))   //for upper case
{
int x=90-(asc-65);
System.out.print((char)x);
}
else if((asc>=97)&&(asc<=122))   //for lower case
{
int x=122-(asc-97);
System.out.print((char)x);
}
else   //for special character
{
int x=asc+1;
System.out.print((char)x);
}
}  //end of for
break;

case 'D':
//case for decoding a message
System.out.println("Enter string to be decoded");
String dc=br.readLine();System.out.println("Encoded message");
for(int i=0;i<dc.length();i++)
{
char ch=dc.charAt(0);
int asc=(int)ch;
if((asc>=65)&&(asc<=90))  //for uppercase
{
int x=(90-asc)+65;
System.out.print((char)x);
}
else if((asc>=97)&&(asc<=122))  //for lower case
{
int x=(122-asc)+90;
System.out.print((char)x);
}
else   //for special character
{
int x=asc-1;
System.out.print((char)x);
}
}  //end of for
break;

default:
System.out.println("INVALID  INPUT");
}  //end of switch
}
}

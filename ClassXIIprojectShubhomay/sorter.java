/* program coded by Shubhomay Kundu Poddar
 program to sort an array in ascending order using selection sort
 */
import java.io.*;
class sorter
{
static int[]arr;
sorter()//default construstor
{
arr= new int[8];
}
void readlist()throws IOException//storing integer elements in the array
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<8;i++)
{
arr[i]= Integer.parseInt(br.readLine());
}
}

int indexofmin(int startindex[])//determining the min value from starting index entered by user
{
     int min=9999999;
for (int i=0;i<startindex.length;i++)
{
   
    if(startindex[i]<min)
    min=startindex[i];
}
return min;
}
void selectionsort(int arr[])//sorting the array
{
int n= arr.length;
for(int i=0;i<n-1;i++)
{
int min=i;
for(int j=i+1;j<n;j++)
if(arr[j]<arr[min])
min= j;
//swapping of values
int temp= arr[min];
arr[min]=arr[i];
arr[i]= temp;

}
}
void displaylist()//printing the sorted list of integers
{
System.out.println();
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+ " ");
}
}
public static void main()throws IOException
{
    sorter ob= new sorter();//creating object
    System.out.print("Enter elements of array:");
    ob.readlist();
    ob.selectionsort(arr);
    ob.displaylist();
    int n=ob.indexofmin(arr);
    System.out.println("The smallest number of the series is "+n);
}
}


import java.util.*;
class s 
{public static void main()
{Scanner sc=new Scanner(System.in);
int temp , a[]=new int[10], min=0;
for(int i=0; i<10; i++)
{System.out.println("ENTER THE VALUE OF THE ARRAY");
a[i]=sc.nextInt();
}
for(int i=0; i<10; i++)
{min=i;
for(int j=i+1; j<10; j++)
{if(a[j]<a[min])
{min=j;
}
}
temp = a[i];
a[i]=a[min];
a[min]=temp;
}
for(int i=0; i<10; i++)
{System.out.println(a[i]);
}
}
}
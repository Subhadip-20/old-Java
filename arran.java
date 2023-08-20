import java.util.Scanner;

public class arran {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt();
        System.out.println("enter the numbers");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i += 2) {

            System.out.print(a[i] + ",");
        }
        for (int i = n - 2; i >= 0; i -= 2) {

            System.out.print(a[i] + ",");
        }
    }
}
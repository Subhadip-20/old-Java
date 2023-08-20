import java.util.Arrays;

public class OddFrequency {
    public static void main(String[] args) {
        int arr[] = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        int tempt = arr[0];
        int count = 0, sum = 0, i;

        for (i = 0; i < arr.length; i++) {
            if (tempt != arr[i]) {
                tempt = arr[i];
                if (count % 2 != 0) {
                    for (int j = 0; j < count; j++) {
                        sum += arr[i - 1];
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count % 2 != 0) {
            for (int j = 0; j < count; j++) {
                sum += arr[i - 1];
            }
        }
        System.out.println("SUM of array :> " + sum);
    }
}
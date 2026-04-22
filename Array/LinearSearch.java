import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int key = s.nextInt();
        int index = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

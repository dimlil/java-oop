import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Most popular element: "+findMostPopularElement(arr));
    }

    public static int findMostPopularElement(int[] arr) {
        int maxcount = 0;
        int element_having_max_freq = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = arr[i];
            }
        }
        return element_having_max_freq;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        String operation = args[0];
        int result = 0;
        if (operation.equals("a")) {
            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }
        } else if (operation.equals("m")) {
            result = 1;
            for (int i = 0; i < arr.length; i++) {
                result *= arr[i];
            }
        }
        System.out.println("Result = " + result);
    }
}

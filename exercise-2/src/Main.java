public class Main {
    public static void main(String[] args) {
        int[] arr = convertedArray(args);

        System.out.println("Result of addition = " + sum(arr));
        System.out.println("Result of multiplication = " + multiply(arr));
    }
    private static int[] convertedArray(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    private static int multiply(int[] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }
        return result;
    }
}

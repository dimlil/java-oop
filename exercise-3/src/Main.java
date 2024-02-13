import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Min: " + findMin(arr));
        System.out.println("Max: " + findMax(arr));
        System.out.println("Average: " + calculateAverage(arr));
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double calculateAverage(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}

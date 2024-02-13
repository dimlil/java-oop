package bg.unwe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String msg[] = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        System.out.println("Result: " + msg[input-1]);
    }
}

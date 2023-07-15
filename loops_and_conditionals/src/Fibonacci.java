import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value:\t");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second value:\t");
        int num2 = scanner.nextInt();
        System.out.print("Enter the nth value:\t");
        int num = scanner.nextInt();
        int count=2;
        while (count<=num){
            int temp=num2;
            num2=num1+num2;
            num1=temp;
            count++;
        }
        System.out.println(num2+" is the answer.");

    }
}

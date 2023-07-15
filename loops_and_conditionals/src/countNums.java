import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:\t");
        int number = scanner.nextInt();
        System.out.print("Enter the value you want to check:\t");
        int num = scanner.nextInt();
        int counter=0;
        while (number>0){
            int rem=number%10;
            if(rem==num){
                counter++;
            }
            number=number/10;
        }
        System.out.println(num+" is occurred "+counter+" times.");
    }
}

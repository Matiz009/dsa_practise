import java.util.Arrays;
import java.util.Scanner;

public class varArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to add or multiply:\t");
        int num= scanner.nextInt();
        char operation;
        int [] array= new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number:\t");
            array[i]=scanner.nextInt();

        }
        System.out.print("Enter + for addition and * for multiplication:\t");
        operation=scanner.next().trim().charAt(0);
        switch (operation){
            case '+':{
                calSum(array);
            }
            break;
            case '*':{
                calProduct(array);
            }
            break;
            default:{
                System.out.println("Invalid");
            }
        }
    }
    static void calSum(int ...v){//variable length arguments
        int sum=0;
        for (int i = 0; i < v.length; i++) {
            int temp=sum;
             sum=v[i]+temp;
        }
        System.out.println("Sum: "+sum);
    }
    static void calProduct(int ...v){//variable length arguments
        int product=v[0];
        for (int i = 1; i < v.length; i++) {
            int temp=product;
            product=v[i]*temp;

        }
        System.out.println("Product: "+product);
    }
}

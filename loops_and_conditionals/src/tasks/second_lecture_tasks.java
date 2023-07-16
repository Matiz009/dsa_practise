package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class second_lecture_tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:\t");
        int num= scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (num>0){
            nums.add(num%10);
            num=num/10;
        }
        int product= nums.get(0);
        int sum=0;
        int result=0;
        for (int i = 0; i < nums.size(); i++) {
            int temp=sum;
            sum=nums.get(i)+temp;
        }
        for (int i = 1; i < nums.size(); i++) {
            int temp=product;
            product=nums.get(i)*temp;
        }
        System.out.println("Sum of the digits: "+sum);
        System.out.println("Product of the digits: "+product);
        System.out.println("Result = "+product+ " - "+ sum +"= "+(product-sum));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        Scanner scanner = new Scanner(System.in);
        int [] arr = {12,22,32,4,53,56,67,68,69,0};
        int [][] arr2D={
                {12,34,56,32,17,4},
                {23,34,11,56,78,66,3,4,67},
                {11,22,4,56,77,88},
                {4}
        };
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.print("Enter the number:\t");
        int num= scanner.nextInt();
        search2D(arr2D,num);
        searchMax2D(arr2D);
//        findMin(arr);
//        System.out.print("Enter the first number:\t");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter the second number:\t");
//        int num2 = scanner.nextInt();
//        System.out.print("Enter the number you want to find:\t");
//        int num = scanner.nextInt();
//        searchInRange(arr,num1,num2,num);
        //linear_Search(arr,num);
//        System.out.println("Enter the String");
//        String word = scanner.nextLine();
//        System.out.println("Enter the letter");
//        char letter = scanner.next().trim().charAt(0);
//        linear_Search(word,letter);
    }
    static void linear_Search(int[] arr,int num){
        boolean flag=false;
        if(arr.length==0){
            System.out.println("invalid");
        }
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println(num+" is found at "+i+" index.");
                flag=true;
            }

        }
        if(!flag){
            System.out.println("Element not found");
        }

    }
    static void linear_Search(String sample,char letter){
        boolean flag=false;
        if(sample.length()==0){
            System.out.println("invalid");
        }
        for (int i = 0; i < sample.length(); i++) {
            if(letter==sample.charAt(i)){
                System.out.println(letter+ " is found at "+i+" index.");
                flag=true;
            }
        }
        if(!flag){
            System.out.println("Letter not found");
        }

    }
    static void searchInRange(int [] arr, int numA, int numB,int num){
        int indexA=0;
        int indexB=0;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==numA){
                indexA=i;
            }
            if(arr[i]==numB){
                indexB=i;
            }

        }
        System.out.println(indexB);
        System.out.println(indexA);
        while (indexA<indexB){
            if(arr[indexA]==num){
                System.out.println(num+" is found at "+indexA+" .");
                flag=true;
            }
            indexA++;
        }
        if(!flag){
            System.out.println("Element not found in range.");
        }

    }
    static void findMin(int [] arr ){
        int minimum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("Minimum number:\t"+minimum);
    }
    static void search2D(int [][] arr,int num){
        boolean flag=false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(num==arr[row][col]){
                    System.out.println(num+" is found at row: "+(row+1)+" and column: "+(col+1));
                    flag=true;
                }
            }

        }
        if(!flag){
            System.out.println("Not found or error");
        }
    }
    static void searchMax2D(int [][] arr){
        boolean flag=false;
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(max<arr[row][col]){
                    max=arr[row][col];
                    flag=true;
                }
            }

        }
        if(flag){
            System.out.println(max+" is the maximum.");
        }
        else{
            System.out.println("Not found or error");
        }
    }
}
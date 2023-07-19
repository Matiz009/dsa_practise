import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_2d {
    public static void main(String[] args) {
        int [][] arr2d = {
                {10,20,30,40},
                {45,55,65,75},
                {78,79,87,89},
                {93,94,98,100}
        };
        System.out.println(Arrays.toString(search2d(arr2d,87)));
        Scanner scanner=new Scanner(System.in);
        int [] arr ={12,34,56,77,23,45,78,90};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you want to delete:\t");
        int num= scanner.nextInt();
        delArr(arr,num);


    }
    static int[] search2d(int[][] arr, int target){
       int row=0;
       int column=arr.length-1;
       while (row<arr.length && column >=0){
           if(arr[row][column]==target){

               return new int[]{row,column};
           }
           if(arr[row][column]<target){
            row++;
           }
           if(arr[row][column]>target){
               column--;
           }
       }
       return new int[]{-1,-1};
    }
    static void delArr(int[] arr,int num){  //{1,2,4,5,6} {1,4,5,6}
        int [] temp=new int[arr.length-1];
        int a=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num){
                a++;
               temp[a]=arr[i];
            }

        }
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[i];
        }
        System.out.print("Array after deletion:\t");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"\t");
        }

    }


}

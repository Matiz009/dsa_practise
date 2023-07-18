import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,12,34,56};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number:\t");
        int n=scanner.nextInt();
        int res=binarySearch(arr,n);
        if(res==-1){
            System.out.println("Element not found");
        }else{
            System.out.println(n+" found at index: "+res);
        }


    }
    static int binarySearch(int [] arr , int target){
        int start=0;
        int end=arr.length-1;
       while (start<=end){
           int mid=start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }else if(target>arr[mid]){
               start=mid+1;
           }else if(target==arr[mid]){
               return mid;
           }
       }
       return -1;
    }

}

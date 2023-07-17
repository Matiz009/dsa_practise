import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arrAss = {2,4,6,8,14};
        int [] arrDes = {15,12,7,3,1};
        Scanner scanner= new Scanner(System.in);
        System.out.println(Arrays.toString(arrDes));
        System.out.print("Enter the number:\t");
        int num=scanner.nextInt();
        int result=orderAgnosticBs(arrDes,num);
        if(result==-1){
            System.out.println("Number not found");
        }else{
            System.out.println(num+" found at index:\t"+result);
        }

    }
    static int orderAgnosticBs(int [] arr , int num){
        int start=0;
        int end=arr.length-1;
        boolean isAscending=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if(num==arr[mid]){
                return mid;
            }
            if (isAscending){
                if(num<arr[mid]){
                    end=mid-1;
                } else if(num > arr[mid]) {
                    start=mid+1;
                }
            }else{
                if(num<arr[mid]){//12,7,4,2,1
                    start=mid+1;
                } else if(num > arr[mid]) {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}

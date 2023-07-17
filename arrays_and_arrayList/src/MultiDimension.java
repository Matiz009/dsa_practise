import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rnd=random.nextInt(20);
        ArrayList<Integer> arrayList = new ArrayList<>(rnd);
        for (int i = 0; i < rnd; i++) {
            arrayList.add(random.nextInt(30));
        }
        int [] arr={12,34,56,78};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the index of first number:\t");
        int a= scanner.nextInt();
        System.out.print("Enter the index of second number:\t");
        int b= scanner.nextInt();
        swapValue(arr,a,b);
        findMax(arrayList);
        reverseList(arr);
    }
    static void swapValue(int [] arr , int indexA, int indexB){
       int temp=arr[indexB];
       arr[indexB]=arr[indexA];
       arr[indexA]=temp;
       //System.out.println(Arrays.toString(arr));
    }
    static void findMax(ArrayList<Integer> arr ){
        int max= arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
           if(max<arr.get(i)){
               max=arr.get(i);
           }
        }
        System.out.println(max+" is the maximum number.");
    }
    static void reverseList(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swapValue(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

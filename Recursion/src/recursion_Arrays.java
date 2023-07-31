public class recursion_Arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,8,54,3,23,4,6,2,8,23};
        boolean ans=findSorted(arr,0);
        System.out.println(ans);
        findNumArray(arr,0,8);
    }
    static boolean findSorted(int [] arr,int start) {
        if (start == arr.length - 1) {
            return true;
        }
        return arr[start] < arr[start + 1] && findSorted(arr, start + 1);
    }
    static void findNumArray(int [] arr,int start,int target) {
        if(start==arr.length){
            return;
        }
        if(arr[start]==target){
            System.out.print("Number found at index:\t"+start+"\n");
        }
        findNumArray(arr,start+1,target);

    }
}
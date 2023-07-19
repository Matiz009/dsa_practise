import java.util.Arrays;
import java.util.Scanner;

public class Questions_BinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] arr = {5,7,7,8,8,10};
        int [] peakArr ={1,2,3,4,5,6,3,2,1};
        int [] rotated={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int rotation=countINRotated(rotated);
        System.out.println(rotation);
        int result=search(rotated,9);
        System.out.println(rotated[result]+" is found at index: "+result);
        int sol=peakIndexInMountainArray(peakArr);
        System.out.println(peakArr[sol]);
        System.out.println(Arrays.toString(peakArr));
        System.out.print("Enter the number:\t");
        int num= scanner.nextInt();
        int n=findInPeak(peakArr,num);
        if(n!=-1){
            System.out.println(num+" is fount at index: "+n);
        }
//        int[] ans=findStart_End(arr,num);
//        System.out.println(Arrays.toString(ans));
//        int ans=ceilingFinder(arr,num);
//        System.out.println(arr[ans]+" is the ceiling of that number.");
//        int ans2=floorFinder(arr,num);
//        System.out.println(arr[ans2]+" is the floor of that number.");
    }
    static int ceilingFinder(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
              end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
    static int floorFinder(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if(target==arr[mid]){
                return mid;
            }
        }
        return end;
    }
    static int largestCharFinder(char [] arr, char target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        char res= arr[start%arr.length];
        return res;
    }
    static int[] findStart_End(int [] arr, int target){
        int [] ans ={-1,-1};
        int start=Finder(arr,target,true);
        int end=Finder(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int Finder(int [] arr, int target,boolean startF){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if(target==arr[mid]){
                ans=mid;
                if(startF){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    static int findInInfiniteArray(int [] arr , int num){
        int start=0;
        int end=1;
        while (num>arr[end]){
           int temp=end+1;
           //end=previous end + size of box*2
           end=end+(end-start+1)*2;
            start=temp;
        }

        return binarySearch(arr,num,start,end);
    }
    static int binarySearch(int [] arr , int target,int start,int end){
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

    static int peakIndexInMountainArray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return end;
    }
    static int findInPeak(int [] arr, int target){
        int mid=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBs(arr,target,0,mid);
        if (firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBs(arr,target,mid+1,arr.length-1);
        }
    }
    static int orderAgnosticBs(int [] arr , int num,int start,int end){
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
    static int findPivot(int [] arr){
        int start=0;
         int end=arr.length-1;
         while (start<=end){
             int mid=start+(end-start)/2;
             if(mid<end && arr[mid]>arr[mid+1]){
                 return mid;
             }
             if(mid>start && arr[mid]<arr[mid-1]){
                 return mid-1;
             }if(arr[mid]<=arr[start]){
                 end=mid-1;

             }else{
                 start=mid+1;
             }
         }
         return -1;
    }
    static int search(int [] arr, int target){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;

        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int countINRotated(int [] arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }
}

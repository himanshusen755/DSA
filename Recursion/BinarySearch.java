public class BinarySearch {
    //Time complexity is 0(log2n)
    //Space complexity = O(n) or best case senario 0(logn)
    public static void main(String[] args) {
        int [] arr = {2,4,8,10,12,16,20};
        int target = 25;
        int n = arr.length;
        int low = 0;
        int high = n -1;
        int res = binarySearch(arr , low , high ,target);
        System.out.println("Target value is at index " +  res);
        
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
         int mid = low + (high-low)/2;
            int res = -1;
         while (low<=high) {
            if (arr[mid]==target) {
                return mid;
             }
             //Recursive calls 
             else if(arr[mid]>target) 
             {
                return binarySearch(arr, low, mid-1, target);
             }
             else{
                return binarySearch(arr, mid+1, high, target);
             }
         }
         return res;
    }
}

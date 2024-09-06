import java.util.*;
///Time complexity is 0(n);
//Space complexity
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n =  sc.nextInt();

        //Input the element of an array

        int [] arr =  new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target Element : ");
        int target = sc.nextInt();

        //Create a HashMap where key is arr[i] and values is a index of an array

        HashMap<Integer , Integer> hm =  new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }
        //create a result array to display the index of two number 
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        //If current element is equal to target
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target && hm.containsKey(0)) {
                result[0]=i;
                result[1] = hm.get(0);                
            }
            else if (hm.containsKey(target-arr[i])) {
                //is the element is non repetative

                if (hm.get(target-arr[i])>i) {
                    result[0] = i;
                    result[1] = hm.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two sum index values are : " + Arrays.toString(result));
    }
}

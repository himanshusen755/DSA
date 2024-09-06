package Arrays;
/* Sum of n  natural numbers is = n(n+1)/2
 * m = n+1
 * sum of elements in an array is find by looping
 * then missing value is = n natural - array sum
*/
public class MissingNumber {
    public static void main(String[] args) {
       int arr[] = {1,3,6,7,2,9,4,5}; 
       int n  = arr.length ;
       int m = n+1;
        int sumOfArray = 0;
       int Sum_of_natural = (m*(m+1))/2;
       for (int i : arr) {
        sumOfArray+=i;
       }
       int Missing = Sum_of_natural - sumOfArray;
       System.out.println("Missing elemnt in an array is : " + Missing);


    }
}
//TIME COMPLEXITIES = O(n)
//SPACE COMPLEXITIES = O(1)

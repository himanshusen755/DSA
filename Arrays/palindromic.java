package Arrays;
// When the array gives same output when traverse from the right side or left side then the array is called 
//palindromic array 

/*Apporach 1
 *  taking new array and store in  reverse order and check by second array then the time complexity &Space Complexity
 * Big-O n
 *Another approach where time and space complextity reduce
 This appoprach is used by taking one array and one loop by checking half left value to the right half
 * SO here we can make reduce the space complexity to the constant one 
 * 
 * 
 */
 public class palindromic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,2,1};
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            if (arr[i]!=arr[n-i-1]) {
                System.out.println("It is not a Palindromic array");
                break;
            }
        }
        System.out.println("It is a Palindromic array ");
        //WHY THIS APPROACH IS USEFUL 
        //TIME COMPLEXITY :- O(n)
        //SPACE COMPLEXITY :- O(1)
    }
    
 }

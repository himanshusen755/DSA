import java.util.*;
//Time complexity = O(n)
//Space complexity = O(n)
public class LeetCode387 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        HashMap<Character , Integer> hm = new HashMap<>();

        //Construction of a HashTable
        //Key = unique Character in the String
        //Value - Frequency of each character in a string
        //CAPTIAL AND SMALL VALUE DIFFENET LEGA
        

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i))==1) {
                System.out.println("The first non repeating character is at : " + i);
                result = i;
                break;
            }
        }
        if (result == -1) {
            System.out.println("No non repeating character in a String : ");
        }
    }
 }

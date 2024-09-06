/*Q5. Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the 
letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote. 
Input: ransomNote = "a", magazine = "b" 
Output: false
Input: ransomNote = "aa", magazine = "ab" 
Output: false */
package Assignment;

import java.util.*;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String RansomNote : ");
        String ransomNote = sc.nextLine();
        System.out.println("Enter the String magazine : ");
        String magazine = sc.nextLine();

        HashMap<Character , Integer> hm1 = new HashMap<>();
        for(int i = 0 ; i< ransomNote.length() ; i++){
            char c  = ransomNote.charAt(i);
            if (hm1.containsKey(c)) {
                hm1.put(c, hm1.get(c)+1);
            }
            else{
                hm1.put(c, 1);
            }
        }
        HashMap<Character , Integer> hm2 = new HashMap<>();
        for(int i = 0 ; i< magazine.length() ; i++){
            char c  = magazine.charAt(i);
            if (hm2.containsKey(c)) {
                hm1.put(c, hm1.get(c)+1);
            }
            else{
                hm2.put(c, 1);
            }
        } //Time complexity = 0(n) + o(m) n = ransomNOte length m = magazine length
        boolean ans  =true;
        for (Map.Entry<Character , Integer>  e : hm1.entrySet() ) {
            if (!hm2.containsKey(e.getKey()) || e.getValue() < hm2.get(e.getKey()) ) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
//False senarios 
/*1. If any ransomNote character is missing in the magazine 
 * 2. Always the count of the element in magazine is more than or equal to ransomNote
 * count of r in any charcter in r > count of in m in any character 
*/
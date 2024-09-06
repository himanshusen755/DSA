public class string{
    public static void backtrack(String str, String curr, int index) 
    { 
        if (index == str. length()) 
        { 
            System.out.println(curr); 
            return; 
        } 
        backtrack(str, curr, index + 1); 
        backtrack(str, curr + str.charAt(index), index + 1); 
    } 
        
public static void main(String[] args) {
    backtrack("abc", " ", 0);
}
}
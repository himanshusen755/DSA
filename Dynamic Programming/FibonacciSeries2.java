public class FibonacciSeries2 {
    public static void main(String[] args) {
      int n = 14521;
      System.out.println("Result :" + fibTab(n));
      System.out.println("Result :" + fibOpt(14521));  

    }
    //Function calling - tabulation appoarch in dynamic Programming(No recursion appoarch)
    public static long fibTab(int n){
        long fib[] = new long[n+1];
        fib[0]= 0;
        fib[1] = 1; 
        for (int i = 2; i <=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n] % 1000000007;
    }
    //Function calling by the most optimized appoarch
    static long fibOpt(int n){
        long first = 0 ,Second = 1 , third;
        for (int i = 2; i <=n; i++) {
            third = first + Second;
            first = Second;
            Second =third;
        }
        return Second % 1000000007;
    }
}

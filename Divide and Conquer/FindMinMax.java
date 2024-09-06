public class FindMinMax {
    static class Pair{
        int min;
        int max;
    }
    public static void main(String[] args) {
        int [] arr = {50,45,11,9,15,75,89,97};
        int n = arr.length;
        Pair p = getMinMax(arr , 0 , n-1 );

        System.out.println("The smallest element is : " + p.min);
        System.out.println("The Largest element is : " + p.max);

    }
    public static FindMinMax.Pair getMinMax(int[] arr, int i, int j) {
        Pair mm = new Pair();
        Pair ML = new Pair(); // ML - minmaxLeft
        Pair MR = new Pair(); // MR - minmaxRight

        // 1. Small Problem 
        //if number of element is equal to 1
        if (i == j) {
            mm.min = arr[i];
            mm.max = arr[i];
        }

        //if numbeer of element is equal to 2 
        //T(n) - constant
        else if (i == j-1) {
            if (arr[i]<arr[j]) {
                mm.min = arr[i];
                mm.max = arr[j];
            }
            else{
                mm.min = arr[j];
                mm.max = arr[i];
            }
        }
        //2. Big problem by D&C 
        //
        else{
            //1.Divide
            int mid = i + (j-i)/2;

            //2. conquer
            //Left subtree - min(left),max(left)
            //t(n) - T(n/2)
            ML = getMinMax(arr, i , mid);

            //Rigth subtree - min(Right), max(Left)
            //t(n) - T(n/2)
            MR = getMinMax(arr, mid+1 , j);

            //3.Combine
            //Constant time  
            if (ML.min<MR.min) {
                mm.min = ML.min;
            }
            else{
                mm.min = MR.min;
            }
            if (ML.max < MR.max) {
                mm.max = MR.max;
            }
            else{
                mm.max = ML.max;
            }
        }
        return mm;
    }
}
// - Time complexity - 0(n)
// - Space complexity - 0(log n)
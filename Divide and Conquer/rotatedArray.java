//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class rotatedArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
       int pivot = findPivot(A,l,h);
       
       if(pivot == -1){
           return binarySearch(A,l,h,key);
       }
       if(A[pivot] == key){
           return pivot;
       }
       if(key>=A[l]){
           return binarySearch(A,l,pivot-1,key);
       }
       else{
           return binarySearch(A,pivot+1,h,key);
       }
    }
    public static int findPivot(int[] A , int l , int h){
        if(h<l){
            return -1;
        }
        int mid = l + (h-l)/2;
        if( mid<h && A[mid]>A[mid+1]){
            return mid;
        }
        if(mid>l && A[mid-1]> A[mid]){
            return mid-1;
        }
        
        if(A[mid]<=A[l]){
            return  findPivot(A,l,mid-1);
        }
        else{
            return findPivot(A,mid+1 , h);
        }
        
    }
    public static int binarySearch(int[] A , int l , int h , int key){
        if(h<l)
            return -1;
        int m = l +(h-l)/2;
        if(A[m] == key){
            return m;
        }
        if(A[m]<key){
            return binarySearch(A,m+1 , h , key);
        }
        else{
            return binarySearch(A,l,m-1,key);
        }
    }
}

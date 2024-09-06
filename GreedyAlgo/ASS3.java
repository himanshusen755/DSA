/*Q3. There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].You 
have a car with an unlimited gas tank and it costs cost[i]” of gas to travel from the ith station to its next (i + 
1)th station. You begin the journey with an empty tank at one of the gas stations.Given two integer arrays 
gas and cost, return the starting gas station s index if you can travel around the circuit once in the clockwise 
direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.  */
public class ASS3 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
        int n = gas.length;

        System.out.println("starting gas station is : " + printGasStation(gas,cost,n));
    }

    private static int printGasStation(int[] gas, int[] cost, int n) {
        int fuel = 0 , start = 0 , sum=0;

        for (int i = 0; i < n; i++) {
            sum+=(gas[i]-cost[i]);
            fuel+=(gas[i]-cost[i]);
                if (fuel<0) {
                   fuel = 0;
                   start = i+1; 
                }
        }
        if (sum>=0) {
            return start % n;
        }
        return -1;
    }
}

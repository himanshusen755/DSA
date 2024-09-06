import java.util.ArrayList;
import java.util.Collections;
//Time complexity - 0(n^2)
//Space Complexity - 0(n)
public class JobScheduling {
    char id;
    int deadline;
    int profit;

    
    public JobScheduling(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }


    public JobScheduling() {
        //TODO Auto-generated constructor stub
    }


    public static void main(String[] args) {
        ArrayList<JobScheduling>  arr = new ArrayList<>();
        arr.add(new JobScheduling('1', 5, 55));
        arr.add(new JobScheduling('2', 2, 65));
        arr.add(new JobScheduling('3', 7, 75));
        arr.add(new JobScheduling('4', 3, 60));
        arr.add(new JobScheduling('5', 2, 70));
        arr.add(new JobScheduling('6', 1, 50));
        arr.add(new JobScheduling('7', 4, 85));
        arr.add(new JobScheduling('8', 5, 68));
        arr.add(new JobScheduling('9', 3, 45));

        System.out.println("Job Sequences to get the maximum profit");

        JobScheduling job = new JobScheduling();
        job.printJobSequence(arr,7);

    }


    private void printJobSequence(ArrayList<JobScheduling> arr, int MD) { //Maximum deadline

        //1. Sort the arr in decreasing order of the profit
        //Lamda Expression
        //nlogn

        int n = arr.size();

        Collections.sort(arr , (a,b)-> b.profit - a.profit);

        //2. Store the job ids on the basis of the max profit and the given deadline 

        //to Track the alloted jobs 
        boolean result[] = new boolean[MD];

        //To store the job ids 
        char[] job = new char[MD];

        //0(n^2)

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(MD-1, arr.get(i).deadline -1); j >= 0; j--) {
                if (result[j]==false) {
                    result[j] = true;
                    job[j]= arr.get(i).id;
                    break;
                }
            }
        }
        for (char c : job) {
            System.out.print(c + " ");
        }
        
    }
}

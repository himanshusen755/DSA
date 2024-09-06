import java.util.Arrays;
import java.util.Comparator;

/**
 * FractionalKnapsak
 */
public class FractionalKnapsak {
    static class item{
        int profit , weight;

        public item(int profit, int weight) {
            this.profit = profit;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        item[] arr = {
                  new item(25, 5),
                  new item(75, 10),
                  new item(100, 12),
                  new item(50, 4),
                  new item(45, 7),
                  new item(90, 9),
                  new item(30, 3),

        };
        int capacity = 37;

        double result = getMax(arr , capacity);
        System.out.println("Maximum profit is : " + result);
    }
    private static double getMax(FractionalKnapsak.item[] arr, int capacity) {
        Arrays.sort(arr , new Comparator<item>(){
            @Override
            public int compare(item o1, item o2) {
                double cpr1 = Double.valueOf(o1.profit/o1.weight);
                double cpr2 = Double.valueOf(o2.profit/o2.weight);

                if (cpr1<cpr2) {
                    return 1;
                }
                else 
                {
                    return -1;
                }

            }
        });

        double totalValue = 0 ;
        for (item i : arr) {
            int curWt = (int)i.weight;
            int curPro = (int)i.profit; 
            if (capacity - curWt >=0) {
                capacity = capacity - curWt;
                totalValue = totalValue + curPro;
            }
            else{
                double fraction = (double)capacity/(double)curWt;
                totalValue = totalValue + (fraction * curPro);
                capacity = (int)(capacity - (fraction * curWt));
                break;
            }
        }
        return totalValue;
    }
}
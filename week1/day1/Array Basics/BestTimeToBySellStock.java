
public class BestTimeToBySellStock {
    // greedy algo
    public int maxProfit(int[] prices) {
        int current = Integer.MAX_VALUE ;
        int max = 0 ;
 
         for (int i : prices) {
            if (i < current) {
                current = i ;
            }
            else if ((i - current )> max) {
                max = i - current;
            }
         }


        return max;
    }

    public static void main(String[] args) {
        BestTimeToBySellStock solver = new BestTimeToBySellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int result = solver.maxProfit(prices);
        System.out.println("Result: " + result);
    }
}

public class Knapsack {
    public static void main(String args[]){

    }
    static int knap(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > W)
            return knap(W, wt, val, n - 1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return Math.max(knap(W, wt, val, n - 1), 
             val[n - 1] + knap(W - wt[n-1], wt, val, n-1));
    }

    
}

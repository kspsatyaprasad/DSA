// Java program to find the maximum profit from buying and selling a stock
class StockProfitCalculator {
    static int calculateMaxProfit(int[] stockPrices, int length) {
        int minPrice = stockPrices[0], maxProfit = 0;
        for (int i = 1; i < length; i++) {

            // Update the minimum price if a new minimum is found
            if (minPrice > stockPrices[i])
                minPrice = stockPrices[i];

                // Update the maximum profit if the current profit is higher than the previous maximum
            else if (stockPrices[i] - minPrice > maxProfit)
                maxProfit = stockPrices[i] - minPrice;
        }
        return maxProfit;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int stockPrices[] = { 7, 1, 5, 6, 4 };
        int length = stockPrices.length;
        int maxProfit = calculateMaxProfit(stockPrices, length);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

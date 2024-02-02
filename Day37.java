//Buy Maximum Stocks if i stocks can be bought on i-th day
//In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
//There is a rule that a customer can buy at most i stock on the ith day.
//If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy.

class Solution {
    static class Product {
        int price;
        int quantity;

        public Product(int price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static int buyMaximumProducts(int n, int budget, int[] prices) {
        ArrayList<Product> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productList.add(new Product(prices[i], i + 1));
        }

        Collections.sort(productList, (a, b) -> {
            if (a.price - b.price == 0) {
                return b.quantity - a.quantity;
            }
            return a.price - b.price;
        });

        int totalQuantity = 0;

        for (Product product : productList) {
            int cost = product.price;
            int availableQuantity = product.quantity;

            if (cost * availableQuantity <= budget) {
                totalQuantity += availableQuantity;
                budget -= cost * availableQuantity;
            } 
            else {
                totalQuantity += budget / cost;
                budget -= cost * (budget / cost);
            }
        }

        return totalQuantity;
    }
}

class StockSpanner {
    Stack<int[]>result;
    public StockSpanner() {
        result = new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!result.isEmpty() && result.peek()[0] <= price){
            count += result.pop()[1];
        }

        result.push(new int []{price, count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

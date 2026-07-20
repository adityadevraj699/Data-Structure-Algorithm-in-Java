class Solution {
    public int maxProfit(int[] prices) {

        int min=Integer.MAX_VALUE, max=0,price=0;

        for(int i=0;i<prices.length;i++){
           if(min>prices[i]){
            min=prices[i];
           }
           else{
            price = prices[i] - min;
            max = Math.max(price,max);
           }

        }


        return max;
        
    }
}
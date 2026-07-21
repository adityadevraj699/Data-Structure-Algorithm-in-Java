class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0, price=0, start=0;

        for(int i=0;i<gas.length;i++){
           tank += gas[i]-cost[i];
            price += gas[i]-cost[i];

            if(tank<0){
                start = i+1;
                tank=0;
            }
        }

        return price<0?-1:start;

        
        
    }
}
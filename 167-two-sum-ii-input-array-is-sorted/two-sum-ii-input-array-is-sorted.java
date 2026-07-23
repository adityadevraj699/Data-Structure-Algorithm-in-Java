class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // HashMap<Integer,Integer> map = new HashMap<>();
        // int[] arr = new int[2];

        // for(int i=0;i<numbers.length;i++){

        //     int temp = target-numbers[i];

        //         if(map.containsKey(temp)){
        //             arr[0] = map.get(temp);
        //             arr[1] = i+1;
        //             return arr;

        //         }
                
        //         map.put(numbers[i], i+1);
        // }

        // return arr;


        int start = 0, end=numbers.length-1;

        while(start<end){
            int sum = numbers[start] + numbers[end];

            if(sum==target){
                return new int[]{start+1, end+1};
            }

            if(sum<target){
                start++;
            }else{
                end--;
            }
        }

        return new int[]{-1,-1};
        
    }
}
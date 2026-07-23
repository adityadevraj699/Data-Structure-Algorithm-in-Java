class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for(int i=0;i<numbers.length;i++){

            int temp = target-numbers[i];

                if(map.containsKey(temp)){
                    arr[0] = map.get(temp);
                    arr[1] = i+1;
                    return arr;

                }
                
                map.put(numbers[i], i+1);
        }

        return arr;
        
    }
}
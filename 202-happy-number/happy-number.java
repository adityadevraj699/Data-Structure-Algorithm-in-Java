class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> num = new HashSet<>();

        while(n>0){
            num.add(n);
            n = sumsq(n);
            if(n ==1) return true;
            if(num.contains(n)) return false;
            
        }

        return false;
        
    }

    public static int sumsq(int digit){
        int sum =0;

        while(digit>0){
            int number = digit%10;
            sum += number*number;
            digit /= 10;
        }

        return sum;
    }
}
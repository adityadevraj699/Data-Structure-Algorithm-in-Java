class Solution {
    public int trap(int[] height) {
       int water =0, n=height.length,leftMax=0,rightMax=0,start=0,end=n-1;

       while(start<end){
        leftMax = Math.max(leftMax,height[start]);
        rightMax = Math.max(rightMax, height[end]);

        if(leftMax<rightMax){
            water += leftMax-height[start];
            start++;
        }else{
            water += rightMax -height[end];
            end--;
        }
       }
        return water;
    }
}
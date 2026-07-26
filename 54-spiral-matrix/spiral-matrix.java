class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> arr = new ArrayList<>();

        int top = 0, buttom = matrix.length -1, left=0, right = matrix[0].length -1;

       while(top <= buttom && left <= right){
            for(int j=left;j<=right;j++){
                arr.add(matrix[top][j]);
            }
            top++;

            for(int j=top;j<=buttom;j++){
                arr.add(matrix[j][right]);
            }
            right--;

            if (top <= buttom) {
                 for(int j=right;j>=left;j--){
                arr.add(matrix[buttom][j]);
            }
            buttom--;
            }

if (left <= right) {
     for(int j=buttom;j>=top;j--){
                arr.add(matrix[j][left]);
            }
            left++;
}
           

           
        }

        return arr;
        
    }
}
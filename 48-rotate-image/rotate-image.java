class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j]; 
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    }

    for(int i=0;i<n;i++){
        reverse(matrix[i]);
    }


    }

    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
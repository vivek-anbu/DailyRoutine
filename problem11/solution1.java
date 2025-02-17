class Solution {
    public void rotate(int[][] matrix) {

        //TransPose Matrix
        for(int i=0;i<matrix.length;i++)
       {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j>=i){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                }
            }
       } 
       //reverse the row
       for(int i=0;i<matrix.length;i++)
       {
            int left=0;
            int right=matrix[i].length-1;
            while(left<=right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
       }
        
    }   

}

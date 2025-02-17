class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list=new ArrayList<>();
        int rs=0;
        int re=matrix.length-1;
        int cls=0;
        int cle=matrix[0].length-1;
        while(cls<=cle&&rs<=re){
        for(int i=cls;i<=cle;i++)
        {
            list.add(matrix[rs][i]);
        }
        rs++;
        for(int i=rs;i<=re;i++)
        {
            list.add(matrix[i][cle]);
        }
        cle--;
        if(rs<=re){
        for(int i=cle;i>=cls;i--)
        {
            list.add(matrix[re][i]);
        }
        re--;
        }
        if(cls<=cle){
        for(int i=re;i>=rs;i--)
        {
            list.add(matrix[i][cls]);
        }
        cls++;}
    }

        return list;
    }
}

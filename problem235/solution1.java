class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        
        int n=values.length;
        Integer indices[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            indices[i]=i;
        }
        Arrays.sort(indices,(i,j)->
        Double.compare((double)values[j]/weights[j],(double)values[i]/weights[i]));
        double sum=0.0;
        for(int i=0;i<n&&W>0;i++)
        {
            int idx=indices[i];
            if(weights[idx]<=W)
            {
                sum=sum+values[idx];
                W=W-weights[idx];
            }
            else
            {
                sum+=(double)values[idx]/weights[idx]*W;
                break;
            }
        }
        return Math.round(sum*1e6)/1e6;
    }
}

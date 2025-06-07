class Solution {
    class Item{
        int value,weight;
        Item(int value,int weight)
        {
            this.value=value;
            this.weight=weight;
        }
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        
        int n=values.length;
        Item items[]=new Item[n];
        for(int i=0;i<n;i++)
        {
            items[i]=new Item(values[i],weights[i]);
        }
        Arrays.sort(items,(a,b)->
        Double.compare((double)b.value/b.weight,(double)a.value/a.weight));        
        
        double sum=0.0;
        for(int i=0;i<n&&W>0;i++)
        {
            if(items[i].weight<=W)
            {
                sum+=items[i].value;
                W-=items[i].weight;
            }
            else
            {
                sum+=(double)items[i].value/items[i].weight*W;
                break;
            }
        }
        return Math.round(sum*1e6)/1e6;
    }
}

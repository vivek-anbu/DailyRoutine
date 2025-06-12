class Solution {
        
    class Job
    {
        int deadline,profit;
        Job(int deadline,int profit)
        {
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
       
       int n=deadline.length;
       Job jobs[]=new Job[n];
       for(int i=0;i<n;i++)
       {
           jobs[i]=new Job(deadline[i],profit[i]);
       }
       Arrays.sort(jobs,(a,b)->b.profit-a.profit);
       int max=0;
       for(int m:deadline)
       {
           max=Math.max(max,m);
       }
       int count=0;
       int hash[]=new int[max+1];
       Arrays.fill(hash,-1);
       int maxProfit=0;
       for(Job job:jobs)
       {
           for(int i=job.deadline;i>0;i--)
           {
              if(hash[i]==-1)
              {
                  hash[i]=1;
                  count++;
                  maxProfit+=job.profit;
                  break;
              }
           }
       }
       ArrayList<Integer> res=new ArrayList<>();
       res.add(count);
       res.add(maxProfit);
       return res;
        
    }
}

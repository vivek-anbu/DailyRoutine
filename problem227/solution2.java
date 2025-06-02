// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
    
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<N;i++)
        {
            pq.add(arr[i]);
        }
        int rank=1;
        while(!pq.isEmpty())
        {
            int a=pq.poll();
            if(!map.containsKey(a))
            {
                map.put(a,rank++);
            }
        }
        for(int i=0;i<N;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}

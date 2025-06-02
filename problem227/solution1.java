// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        
        int ans[]=new int[N];
        int sort[]=arr.clone();
        Arrays.sort(sort);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<sort.length;i++)
        {
            if(!map.containsKey(sort[i]))
            {
                map.put(sort[i],rank++);
            }
        }
        for(int i=0;i<sort.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length%groupSize!=0)
        {
            return false;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<hand.length;i++)
        {
            pq.add(hand[i]);
        }
        while(!pq.isEmpty())
        {
            int smallest=pq.poll();
            for(int i=1;i<groupSize;i++)
            {
                if(  pq.remove(smallest+i))
                {
                    continue;
                }
                else
                {
                    return false;
                }
              
            }
        }
        return true;
    }
}

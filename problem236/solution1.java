// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        
        List<Integer> list=new ArrayList<>();
        int cur[]={2000,500,200,100,50,20,10,5,2,1};
        for(int money:cur)
        {
            while(N>=money)
            {
                list.add(money);
                N=N-money;
            }
        }
        return list;
        
    }
}

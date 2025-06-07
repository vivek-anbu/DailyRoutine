// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> list=new ArrayList<>();
        Integer cur[]={1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(cur,Collections.reverseOrder());
       
        
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

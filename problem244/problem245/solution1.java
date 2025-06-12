// User function Template for Java

class Solution {
    static int pageFaults(int N, int C, int pages[]) {
       
       int count=0;
       LinkedList<Integer> list=new LinkedList<>();
       for(int i=0;i<N;i++)
       {
           if(!list.contains(pages[i])&&list.size()<C)
           {
               count++;
               list.add(pages[i]);
           }
           else if(!list.contains(pages[i])&&list.size()==C)
           {
               count++;
               list.remove(0);
               list.add(pages[i]);
           }
           else
           {
               int ind=list.indexOf(pages[i]);
               list.remove(ind);
               list.add(pages[i]);
           }
           
       }
       return count;
        
    }
}

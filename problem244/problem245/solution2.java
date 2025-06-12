// User function Template for Java

class Solution {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        LinkedList<Integer> list=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(list.contains(pages[i]))
            {
                list.remove(pages[i]);
                list.add(pages[i]);
            }
            else
            {
                count++;
                if(list.size()==C)
                {
                    int item=list.removeFirst();
                    set.remove(item);
                }
                list.add(pages[i]);
                set.add(pages[i]);
            }
        }
        return count;
    }
}

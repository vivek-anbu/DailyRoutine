//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

// User function Template for Java
class Solution {
    public int[] twoOddNum(int Arr[], int N) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<N;i++)
        {
            map.put(Arr[i],map.getOrDefault(Arr[i],0)+1);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> it:map.entrySet())
        {
            if(it.getValue()%2!=0)
            {
                list.add(it.getKey());
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        arr[0]=list.get(0);
        arr[1]=list.get(1);
        return arr;
    }
}

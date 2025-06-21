// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            list.add(arr[i]);
        }
        Collections.sort(list,(a,b)->{
          int freqA=map.get(a);
          int freqB=map.get(b);
          if(freqA!=freqB)
          {
              return freqB-freqA;
          }
          else
          {
              return a-b;
        }
        });
        return list;
    }
}



class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
  
        int max=arr[arr.length-1];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st=new Stack<>();
       for(int asteroid:asteroids)
       {
        boolean alive=true;
        while(alive&&asteroid<0&&st.size()>0&&st.peek()>0)
        {
            if(Math.abs(asteroid)>st.peek())
            {
                st.pop();
            }
            else if(Math.abs(asteroid)==st.peek())
            {
                st.pop();
                alive=false;
            }
            else
            {
                alive=false;
            }
        }
        if(alive)
        {
            st.push(asteroid);
        }
        } 
        int res[]=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty())
        {
            res[i--]=st.pop();
        }
        return res;
  }
}

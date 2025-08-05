package inter;

import java.util.*;

public class Problem54 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Set<String> knowPeople=new HashSet<>();
        Set<String> newFriends=new HashSet<>();
        
        int n=Integer.parseInt(in.nextLine());
        
        for(int i=0;i<n;i++)
        {
        	String input[]=in.nextLine().split(" ");
        	String person=input[0];
        	knowPeople.add(person);
        	
        	int friendsCount=Integer.parseInt(input[1]);
        	for(int j=2;j<2+friendsCount;j++)
        	{
        		String friend=input[j];
        		if(!knowPeople.contains(friend))
        		{
        			newFriends.add(friend);
        		}
        	}
        }
        
        newFriends.removeAll(knowPeople);
    
        for(String s:newFriends)
        {
        	System.out.print(s+" ");
        }
    }
}

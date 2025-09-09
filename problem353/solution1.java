package inter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindNewFriends {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		Set<String> knowPeople=new HashSet<>();
		Set<String> newFriends=new LinkedHashSet<>();
		int n=Integer.parseInt(in.nextLine());
		for(int i=0;i<n;i++)
		{
			String input[]=in.nextLine().split(" ");
			String person=input[0];
			knowPeople.add(person);
			
			int friendsCount=Integer.parseInt(input[1]);
			for(int j=2;j<2+friendsCount;j++)
			{
				String friends=input[j];
				if(!knowPeople.contains(friends))
				{
					newFriends.add(friends);
				}
			}
		}
		newFriends.removeAll(knowPeople);
		
		for(String s:newFriends)
		{
			System.out.print(s+" ");
			
		}
	}
//	mani 3 ram raj guna
//	ram 2 kumar kishore
//	mughil 3 praveen naveen ramesh
}

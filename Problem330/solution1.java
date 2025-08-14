package inter;

import java.util.ArrayList;
import java.util.List;

public class Problem70 {

	public static void main(String[] args) {
		int arr[]= { 2, -3, -4, 5, 9, 7, 8};
		int n=arr.length;
		List<Integer> ans=new ArrayList<>();
		int i=1;
		int min=arr[0];
		ans.add(min);
		while(i<n)
		{	
			
			if(min<arr[i])
			{
				min=arr[i];
				ans.add(min);
				
			}
			i++;
		}
		
		System.out.println("Greater Elements : " +ans);

	}

}

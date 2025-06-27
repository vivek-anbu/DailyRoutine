package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem18 {

	public static void main(String[] args) {
		
		// int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr[]= {13, 2, 4, 15, 12, 10, 5}; 
		System.out.print("Input Array: ");
		 for(int a:arr)
		 {
			 System.out.print(a+" ");
		 }
		 System.out.println();
		 System.out.println("Sorted Array: ");
		 for(int a:Problem18.sortedArray(arr))
		 {
			 System.out.print(a+" ");
		 }
	

	}
	
	public static int[] sortedArray(int []a)
	{
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if((i+1)%2==1)
			{
				odd.add(a[i]);
			}
			else
			{
				even.add(a[i]);
			}
		}
		Collections.sort(odd,Collections.reverseOrder());
		Collections.sort(even);
		
		int res[]=new int[n];
		int odd1=0;
		int even1 =0;
		for(int i=0;i<n;i++)
		{
			if((i+1)%2==1)
			{
				res[i]=odd.get(odd1++);
			}
			else
			{
				res[i]=even.get(even1++);
			}
		}
		return res;
	}

}

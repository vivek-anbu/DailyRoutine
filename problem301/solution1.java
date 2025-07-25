package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem39 {

	public static void main(String[] args) {
		
		//int arr[]= {13,2,4,15,12,10,5};
		int arr[]={1,2,3,4,5,6,7,8,9};
		System.out.print("Input Array ");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("OutPut Array ");
		int ans[]=new int[arr.length];
		ans=rearrangeArray(arr);
		for(int an:ans)
		{
			System.out.print(an+" ");
		}
	}
	public static int[] rearrangeArray(int arr[])
	{
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if((i+1)%2==1)
			{
				odd.add(arr[i]);
			}
			else 
			{
				even.add(arr[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd,Collections.reverseOrder());
		int odd1=0;
		int even1=0;
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
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

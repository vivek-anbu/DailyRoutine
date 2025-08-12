package inter;

import java.util.Arrays;

public class Problem64 {

	public static void main(String[] args) {
		
		int arr[]= {5,2,8,7,4,3,9};
		
		sort(arr);
	}
	public static void sort(int arr[])
	{
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int i=0;
		int ans[]=new int[arr.length];
		while(left<=right)
		{
			if(i%2!=0)
			{
				ans[i++]=arr[left++];
			}
			else
			{
				ans[i++]=arr[right--];
			}
		}
		System.out.println("Alternatively Sorted :");
		for(int a:ans)
		{
			System.out.print(a+" ");
		}
	}

}

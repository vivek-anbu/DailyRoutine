package inter;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {

	public static void main(String[] args) {
		
	int arr[]= {1, 2, 3, 4, 5, 6, 7};
	System.out.print("Orginal Array:");
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
	System.out.println();	
	System.out.print("Rearranged Array:");
	int ans[]=rearrangedArray(arr);
	for(int ar:ans)
	{
		System.out.print(ar+" ");
	}
	
	}
	
	public static int[] rearrangedArray(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		int index=0;
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(index%2==0)
			{
				res[index++]=arr[right--];
			}
			else
			{
				res[index++]=arr[left++];
			}
		}
		return res;
	}

}

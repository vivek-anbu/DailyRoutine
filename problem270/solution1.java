package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem12 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int ans[]=rearrangeArray(arr);
		System.out.print("Orgianl Array:");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("Rearranged Array:");
		for(int r:ans)
		{
			System.out.print(r+" ");
		}
	}
	
	public static int[] rearrangeArray(int[] arr)
	{
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int index=0;
		int res[]=new int[arr.length];
		while(left<=right)
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

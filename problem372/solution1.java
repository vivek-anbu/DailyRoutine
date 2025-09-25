package inter;

import java.util.Arrays;

public class SortAlternatively {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		
		System.out.println("Orginal Array:");
		System.out.println(Arrays.toString(arr));
		
		int a[]=sort(arr);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(a));

	}
	public static int[] sort(int arr[])
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

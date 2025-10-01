package inter;

import java.util.Arrays;

public class AlternativeSort {

	public static void main(String[] args) {
		
		int a[]= {5,2,8,7,4,3,9};
		sort(a);

	}
	public static void sort(int a[])
	{
		Arrays.sort(a);
		int left=0;
		int right=a.length-1;
		int index=0;
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				res[index++]=a[right--];
			}
			else
			{
				res[index++]=a[left++];
			}
		}
		System.out.println("Sorted Array:");
		for(int arr:res)
		{
			System.out.print(arr+" ");
		}
	}

}

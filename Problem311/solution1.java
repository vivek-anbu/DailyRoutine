package inter;

public class Problem49 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Original Array :");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Sorted Array:");
		int res[]=rearrangeArray(arr);
		for(int ans:res)
		{
			System.out.print(ans+" ");
		}

	}
	public static int[] rearrangeArray(int arr[])
	{
		
		int left=0;
		int right=arr.length-1;
		int index=0;
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
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

package inter;

import java.util.ArrayList;

class Solution
{
	public int sumArray(int arr[],int k)
	{
		
		int maxSum=0;
		int n=arr.length;	
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int sum=0;
			int m=k;
			int ind=0;
			for(int j=i;j<n;j++)
			{
				if(m>0)
				{
					sum=sum+arr[j];
					m--;
				}
				else
				{
					break;
				}
				ind=j;
			}
			if(sum>maxSum) {
			while(i<=ind)
			{
				list.add(arr[i]);
				i++;
			}
			}else
			{
				list.clear();
			}
			
			maxSum=Math.max(sum,maxSum);
			
			
		}
		
		System.out.println("Elements: "+list);
		return maxSum;
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		int arr[]= {2,7,5,1,3,2,9,7};
		int k=3;
		Solution s=new Solution();
		System.out.println(s.sumArray(arr, k));
		
		
	}

}

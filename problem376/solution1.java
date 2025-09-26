package inter;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		int arr[]= {3, 2, 7, 6, 5, 1, 2, 3, 4};
		int k=3;
		System.out.println("Orginal Array:"+Arrays.toString(arr));
		System.out.println("Sliding window Size:"+k);
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<=arr.length-k;i++)
		{
			int max=arr[i];
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			list.add(max);
		}
		System.out.println("Maximums:"+list);
	}

}

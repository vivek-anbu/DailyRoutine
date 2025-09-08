package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigAdd {

	public static void main(String[] args) {
		
		int arr1[]= {7,2,3,4,5,3,1,2,7,2,8};
		int arr2[]= {1,2,3};
		
		List<Integer> res=add(arr1,arr2);
		System.out.println("Sum :"+res);
	}
	public static List<Integer> add(int arr1[],int arr2[])
	{
		List<Integer> ans=new ArrayList<>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		while(i>=0||j>=0||carry>0)
		{
			int sum=carry;
			if(i>=0)
				sum+=arr1[i--];
			if(j>=0)
				sum+=arr2[j--];
			ans.add(sum%10);
			carry=sum/10;
		}
		Collections.reverse(ans);
		return ans;
	}

}

package inter;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr1[]= {2,4,5,6,7,9,10,13};
		int arr2[]= {2,3,4,5,6,7,8,9,11,15};
		ArrayList<Integer> list=new ArrayList<>();
		
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
				{
					list.add(arr1[i]);
				}
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
				{
					list.add(arr1[i]);
				}
				i++;
			}
			else
			{
				if(list.isEmpty()||list.get(list.size()-1)!=arr2[j])
				{
					list.add(arr2[j]);
				}
				j++;
			}
		}
		while(i<arr1.length)
		{
			if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
			{
				list.add(arr1[i]);
			}
			i++;
		}
		while(j<arr2.length)
		{
			if(list.isEmpty()||list.get(list.size()-1)!=arr2[j])
			{
				list.add(arr2[j]);
			}
			j++;
		}
		System.out.println("Merged Array :"+list);

	}

}

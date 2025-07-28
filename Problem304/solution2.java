package inter;

import java.util.ArrayList;
import java.util.List;

public class Problem42 {

	public static void main(String[] args) {
		
		int a1[]= {2,4,5,6,7,9,10,13};
		int a2[]= {2,3,4,5,6,7,8,9,11,15};
		System.out.println("Merge String");
		List<Integer> res=mergedString(a1,a2);
		System.out.println(res);
	}
	public static List<Integer> mergedString(int a1[],int a2[])
	{
	/*	Arrays.sort(a1);
		Arrays.sort(a2);
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<a1.length;i++)
		{
			set.add(a1[i]);
		}
		for(int i=0;i<a2.length;i++)
		{
			set.add(a2[i]);
		}
		System.out.println(set);
		*/
		int i=0;
		int j=0;
		List<Integer> list=new ArrayList<>();
		while(i<a1.length&&j<a2.length)
		{
			if(a1[i]==a2[j])
			{
				if(list.isEmpty()||list.size()-1!=a1[i])
				{
					list.add(a1[i]);
				}
				i++;
				j++;
			}
			else if(a1[i]<a2[j])
			{
				if(list.isEmpty()||list.size()-1!=a1[i])
				{
					list.add(a1[i]);
				}
				i++;
			}
			else 
			{
				if(list.isEmpty()||list.size()-1!=a2[j])
				{
					list.add(a2[j]);
				}
				j++;
			}
		}
		while(i<a1.length)
		{
			if(list.isEmpty()||list.size()-1!=a1[i])
			{
				list.add(a1[i]);
			}
			i++;
		}
		while(j<a2.length)
		{
			if(list.isEmpty()||list.size()-1!=a2[j])
			{
				list.add(a2[j]);
				
			}
			j++;
		}
		
		return list;
	}
	
}
	



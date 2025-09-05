package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfGroups {

	public static void main(String[] args) {
		
		int x=3;
		int a[]= { 3, 9, 7, 4, 6, 8};
		
		List<Integer> allowed=Arrays.asList(3,9,6);
		List<Integer> filtered=new ArrayList<>();
		
		for(int arr:a)
		{
			if(allowed.contains(arr))
			{
				filtered.add(arr);
			}
		}
		List<List<Integer>> res=new ArrayList<>();
		findGroups(filtered,x,2,res);
		findGroups(filtered,x,3,res);
		System.out.println("Groups:");
		for(List<Integer> ans:res)
		{
			System.out.println(ans);
		}
		System.out.println("Group Size:"+res.size());
		
	}
	public static void findGroups(List<Integer> filtered,int x,int groupSize,List<List<Integer>> res)
	{
		 combine(filtered,x,groupSize,0,new ArrayList<>(),res);
	}

	public static void combine(List<Integer> filtered,int x,int groupSize,int start,List<Integer> temp,List<List<Integer>> res)
	{
		if(temp.size()==groupSize)
		{
			int sum=0;
			for(int a:temp)
			{
				sum+=a;
			}
			if(sum%x==0)
			{
				res.add(new ArrayList<>(temp));
			}
			return ;
		}
		
		for(int i=start;i<filtered.size();i++)
		{
			temp.add(filtered.get(i));
			combine(filtered,x,groupSize,i+1,temp,res);
			temp.remove(temp.size()-1);
		}
	}
}

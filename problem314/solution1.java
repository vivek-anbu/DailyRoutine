package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem52 {
	
	public static void main(String args[])
	{
		
		int arr[]= {3, 9, 7, 4, 6, 8};
		int x=3;
		List<Integer> allowed=Arrays.asList(3,9,6);
		List<Integer> filtered =new ArrayList<>(); 
		for(int a:arr)
		{
			if(allowed.contains(a))
			{
				filtered.add(a);
			}
		}
		List<List<Integer>> result=new ArrayList<>();
		findGroups(filtered,x,2,result);
		findGroups(filtered,x,3,result);
		for(List<Integer> res:result)
		{
			System.out.println(res);
		}
		System.out.println("No of Groups:"+result.size());
	}
	public static void findGroups(List<Integer> filtered,int x,int groupSize,List<List<Integer>> result)
	{
		combine(filtered,x,groupSize,0,new ArrayList<>(),result);
	}
	public static void combine(List<Integer> filtered,int x,int groupSize,int start,List<Integer> temp,List<List<Integer>> result)
	{
		if(temp.size()==groupSize)
		{
			int sum=0;
			for(int num:temp)
			{
				sum+=num;
			}
			if(sum%x==0)
			{
				result.add(new ArrayList<>(temp));
			}
		}
		
		for(int i=start;i<filtered.size();i++)
		{
			temp.add(filtered.get(i));
			combine(filtered,x,groupSize,i+1,temp,result);
			temp.remove(temp.size()-1);
		}
	}
}

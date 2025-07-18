package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem29 {

	public static void main(String[] args) {
		
		int arr[]= {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		sortArray(arr);
		
	}      
	public static void sortArray(int arr[])
	{
		int n=arr.length;
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			list.add(arr[i]);
		}
		Collections.sort(list,(a,b)->{
		int freqA=map.get(a);
		int freqB=map.get(b);
		if(freqA!=freqB)
			return freqB-freqA;
		else
			return a-b;
		});
		
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		
		System.out.println(list);
	}
	

}

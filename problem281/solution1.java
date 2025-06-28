package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem24 {

	public static void main(String[] args) {
		
		int arr[]= {8, 2, 3, 12, 16};
		
		List<Integer> list=new ArrayList<>();
		for(int a:arr)
		{
			list.add(a);
		}
		Collections.sort(list,(a,b)->{
			
			int factA=counters(a);
			int factB=counters(b);
			return Integer.compare(factB,factA);
			});
		for(int ans:list)
		{
			System.out.print(ans+" ");
		}
	}
	public static int counters(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	

}

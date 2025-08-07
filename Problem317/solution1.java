package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Problem56 {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 9));
		List<Integer> list2=new ArrayList<>(Arrays.asList(1, 5, 8, 9, 2));
		
		Set<Integer> union=new LinkedHashSet<>(list1);
		union.addAll(list2);
		
		Set<Integer> intersection=new LinkedHashSet<>(list1);
		intersection.retainAll(list2);
	
		Set<Integer> expect =new LinkedHashSet<>();
		for(int num:list1)
		{
			if(num%2!=0)
			{
				expect.add(num);
			}
		}
		for(int num:list2)
		{
			if(num%2==0)
			{
				expect.add(num);
			}
		}
		
		System.out.println("union: "+union);
		System.out.println("InterSection :"+intersection);
		System.out.println("expect :"+expect);
	}

}

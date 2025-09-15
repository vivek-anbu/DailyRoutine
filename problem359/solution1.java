package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindUnionIntersection {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>(Arrays.asList(1,3,4,5,6,8,9));
		List<Integer> list2=new ArrayList<>(Arrays.asList(1, 5,8,9,2));
		
		Set<Integer> union=new LinkedHashSet<>(list1);
		union.addAll(list2);
		Set<Integer> interSection=new LinkedHashSet<>(list1);
		interSection.retainAll(list2);
		Set<Integer> except=new LinkedHashSet<>();
		for(int num:list1)
		{
			if(num%2!=0)
			{
				except.add(num);
			}
		}
		for(int num:list2)
		{
			if(num%2==0)
			{
				except.add(num);
			}
		}
		System.out.println("Union:"+union);
		System.out.println("Intersection:"+interSection);
		System.out.println("except:"+except);

	}

}

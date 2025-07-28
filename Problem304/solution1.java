package inter;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Problem42 {

	public static void main(String[] args) {
		
		int a1[]= {2,4,5,6,7,9,10,13};
		int a2[]= {2,3,4,5,6,7,8,9,11,15};
		System.out.println("Merge String");
		mergedString(a1,a2);

	}
	public static void mergedString(int a1[],int a2[])
	{
		
		
		Arrays.sort(a1);
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
		
		}
	}
	



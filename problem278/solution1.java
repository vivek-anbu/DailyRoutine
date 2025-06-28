package inter;

import java.util.Set;
import java.util.TreeSet;

public class Problem21 {

	public static void main(String[] args) {
		
		int arr1[]= {2,4,5,6,7,9,10,13};
		int arr2[]= {2,3,4,5,6,7,8,9,11,15};
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		System.out.println(set);
		
		

	}

}

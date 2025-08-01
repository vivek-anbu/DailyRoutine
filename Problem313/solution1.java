package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem51 {

	public static void main(String[] args) {
		
			int num1[]= {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
			int num2[]= {7, 8, 4, 6, 2, 1, 9, 9, 7};
			 
			int i=num1.length-1;
			int j=num2.length-1;
			List<Integer> list=new ArrayList<>();
			int carry=0;
			while(i>=0||j>=0||carry!=0)
			{
				int digit1=(i>=0)?num1[i]:0;
				int digit2=(j>=0)?num2[j]:0;
				
				int sum=digit1+digit2+carry;
				list.add(sum%10);
				carry=sum/10;
				i--;
				j--;
			}
			Collections.reverse(list);
			for(int a:list)
			{
				System.out.print(a+" ");
			}
	}

}

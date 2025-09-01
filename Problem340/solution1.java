package core;

import java.util.Arrays;

public class ThirdMax {

	public static void main(String[] args) {

		int arr[]= {12, 45, 1, 67, 34, 89, 23};
		
		int first=0,second=0,third=0;
		for(int num:arr)
		{
			if(first==0||num>first)
			{
				third=second;
				second=first;
				first=num;
			}
			else if((second==0||num>second)&&num<first)
			{
				third=second;
				second=num;
			}
			else if((third==0||num>third)&&num<second)
			{
				third=num;
			}
		}
		if(third!=0)
		{
			System.out.println("Third Max:"+third);
		}
		else
		{
			System.out.println("Not found");
		}
	
	}

}

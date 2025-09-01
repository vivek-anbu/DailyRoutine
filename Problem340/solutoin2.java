package core;

import java.util.Arrays;

public class ThirdMax {

	public static void main(String[] args) {

		int arr[]= {12, 45, 1, 67, 34, 89, 23};
		Arrays.sort(arr);
		System.out.println("Third Max:"+arr[arr.length-3]);
	
	}

}

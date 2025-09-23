package inter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of Dates:");
		int n=in.nextInt();
		in.nextLine();
		List<LocalDate> dates=new ArrayList<>();
		System.out.println("Enter Dates:");
		for(int i=0;i<n;i++)
		{
			String input=in.nextLine();
			LocalDate date=LocalDate.parse(input);
			dates.add(date);
		}
		Collections.sort(dates);
		for(LocalDate days:dates)
		{
			System.out.println(days);
		}
	}

}

package inter;

public class Problem25 {

	static final String units[]= {
		""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve",
		" Thirteen"," Fourteen"," Fifteen"," Sixteen"," SevenTeen"," Eighteen"," Nineteen"
	};
	static final String tens[]= {
		"",""," Twenty"," Thirty"," Forty"," Fifity"," Sixty"," Seventy"," Eighty"," Ninety"	
	};
	public static void main(String args[])
	{
		//int num=234;
		int num=999;
		System.out.println(Problem25.convertNum(num));
	}
	public static String convertNum(int num)
	{
		if(num==0)
		{
			return "Zero";
		}
		StringBuilder sb=new StringBuilder();
		if(num>=100)
		{
			if(num/100!=0)
			{
				sb.append(units[num/100]).append(" Hundred");
			}
			num=num%100;
			if(num!=0)
			{
				sb.append(" And");
			}
		}
		
		if(num>=20)
		{
			sb.append(tens[num/10]);
			if(num%100!=0)
			{
				sb.append(units[num%10]);
			}
		}
		return sb.toString();
	}
	
}

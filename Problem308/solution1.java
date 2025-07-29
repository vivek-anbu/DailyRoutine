package inter;

public class Problem46 {

	static String units[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
			"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	static String tens[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	public static void main(String[] args) {
	
		//int num=234;
		int num=900;
		System.out.println("Converted String :"+convertNum(num));
	}
	public static String convertNum(int num)
	{
	
			StringBuilder sb=new StringBuilder();
			if(num>=100)
			{
				if(num/100!=0)
				{
					sb.append(units[num/100]+" ").append(" Hundred");
				}
				num=num%100;
				if(num!=0)
				{
					sb.append(" And ");
				}
			}
			if(num>=20)
			{
				sb.append(tens[num/10]+" ");
				if(num%100!=0)
				{
					sb.append(units[num%10]+" ");
				}
			}
		
			return sb.toString();
	}
		

}

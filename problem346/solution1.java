package inter;

public class NumberToWord {
	
	static String units[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
							"Sixteen","Seventeen","Eighteen","Nineteen"};
	static String tens[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	public static void main(String[] args) {
		
		int n=1;
		String s=convertNumber(n);
		System.out.println("Number in words: "+s);
		
	}
	public static String convertNumber(int num)
	{
		   StringBuilder sb=new StringBuilder();
		   
		   if(num==0)
		   {
			   return "Zero";
		   }
		   if(num>=100)
		   {
			   if(num/100!=0)
			   {
				   sb.append(units[num/100]+" ").append("Hundred ");
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
		   else if(num>0)
		   {
			   sb.append(units[num%100]+" ");
		   }
		   return sb.toString();
	}
	

}

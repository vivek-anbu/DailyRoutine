package inter;

public class PrintAllPossibleCom {

	public static void main(String[] args) {
		
		String str="abc";
		
		generateCom(str,0,"");

	}
	public static void generateCom(String str,int index,String current)
	{
		if(index==str.length())
		{
			System.out.println(current);
			return;
		}
		generateCom(str,index+1,current+str.charAt(index));
		generateCom(str,index+1,current);
	}

}

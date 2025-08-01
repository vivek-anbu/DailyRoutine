package inter;

public class Problem50 {

	public static void main(String[] args) {
		
		char arr1[]= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
		char arr2[]= {'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i'};
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
				{
					sb.append(arr1[i]).append(arr2[i]+",");
				}
			
		}
		
		System.out.println("Mismatched Elements :" + sb.toString());
	}

}

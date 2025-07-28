package inter;

public class Problem40 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			int j=arr.length-1-i;
			for(int k=0;k<arr.length;k++)
			{
				if(k==i||k==j)
				{
					System.out.print(arr[k]);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

}
}

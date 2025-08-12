package inter;

public class Problem65 {

	public static void main(String[] args) {
		
		int[] arr = {5, 8, 10, 13, 6, 2};
		int threshold=3;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=count+(arr[i]+threshold-1)/threshold;
		}

		System.out.println("Group Count : "+count);
	}

}

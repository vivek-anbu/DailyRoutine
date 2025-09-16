package inter;

public class RearrangeTwoDimen {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		reArrange(arr);
	}
	public static void reArrange(int a[][])
	{
		int n=a.length;
		int top=0;
		int left=0;
		int bottom=n-1;
		int right=n-1;
		
		while(left<right&&top<bottom)
		{
			int prev=a[top+1][left];
			for(int i=left;i<=right;i++)
			{
				int cur=a[top][i];
				a[top][i]=prev;
				prev=cur;
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				int cur=a[i][right];
				a[i][bottom]=prev;
				prev=cur;
			}
			right--;
			for(int i=right;i>=left;i--)
			{
				int cur=a[bottom][i];
				a[bottom][i]=prev;
				prev=cur;
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				int cur=a[i][left];
				a[i][left]=prev;
				prev=cur;
			}
			left++;
			
		}
		for(int ans[]:a)
		{
			for(int res:ans)
			{
				System.out.print(res+" ");
			}
			System.out.println();
		}
		
		
	}

}

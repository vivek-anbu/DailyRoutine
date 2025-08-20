package inter;

public class Problem78 {

	public static void main(String[] args) {
		
		int a[]= {2, 3, 7, 1, 8, 5, 11};
		
		for(int i=0;i<a.length;i++)
		{
			int cur=a[i];
			Integer minInteger=null;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>cur)
				{
					if(minInteger==null||a[j]<minInteger)
					{
						minInteger=a[j];
					}
				}
			}
			if(minInteger!=null)
			{
				System.out.print(cur+">"+minInteger+",");
			}
			else
			{
				System.out.print(cur+">");
			}
			
		}
		

	}

}

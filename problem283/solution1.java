package inter;

public class Problem26 {

	public static void main(String[] args) {
		
		int n=5;
		int data[]= {1,1,1,2,1,1,2,1,1,1,1,1,2,2};
		int initialPetrol=3;
		
		int remaining=Problem26.findRemaining(n,data,initialPetrol);
		if(remaining>0)
		{
			System.out.println("Yes ,Remaining petrol is "+ remaining);
		}
		else
		{
			System.out.println("NO ,you cant travel");
		}
	}
	public static int findRemaining(int n,int data[],int Petrol)
	{
		
		int index=0;
		for(int i=0;i<n;i++)
		{
			int distance=data[index++];
			int fill=data[index++];
			
			Petrol=Petrol-distance;
			if(Petrol<0)
			{
				return -1;
			}
			Petrol+=fill;
		}
		return Petrol;
	}

}

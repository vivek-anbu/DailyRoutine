package inter;

public class Problem28 {

	public static void main(String[] args) {
		
		int initialPetrol=2;
		int distances[]= {1, 5, 3};
		int capacites[]= {6, 4, 2};
		int remaining=Problem28.remaining(initialPetrol,distances,capacites);
		if(remaining>=0)
		{
			System.out.println("yes ,Remaining is "+remaining);
		}
		else
		{
			System.out.println("NO Can't Travel");
		}
	}
	
	public static int  remaining(int petrol,int distance[],int capacities[])
	{
		for(int i=0;i<distance.length;i++)
		{
			petrol=petrol-distance[i];
			
			if(petrol<0)
			{
				return -1;
			}
			petrol+=capacities[i];
		}
		
		return petrol;
	}

}

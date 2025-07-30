package inter;

public class Problem47 {

	public static void main(String[] args) {
		
		int distance[]= {1,5,3};
		int capacity[]= {3,4,2};
		int initialPetrol=2; 
		int remaining=remaining(initialPetrol,distance,capacity);
		if(remaining>=0)
		{
			System.out.println("Remaining Petrol "+remaining);
		}
		else
		{
			System.out.println("You Can't travel");
		}

	}
	
	public static int remaining(int petrol,int distance[],int capacity[])
	{
		
		for(int i=0;i<distance.length;i++)
		{
			petrol=petrol-distance[i];
			
			if(petrol<0)
			{
				return -1;
			}
			petrol=petrol+capacity[i];
			
		}
		return petrol;
		
	}
}

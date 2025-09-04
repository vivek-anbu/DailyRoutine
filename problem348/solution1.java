package inter;

public class PetrolBunk {

	public static void main(String[] args) {
		
		int distance[]= {1,5,3};
		int capacity[]= {6,4,2};
		int initialPetrol=2;
		int remaining=petrolRemain(initialPetrol,distance,capacity);
		if(remaining>0)
		{
			System.out.println("Remaining Petrol:"+remaining);
		}
		else
		{
			System.out.println("Can not travel ");
		}
		
	}
	public static int petrolRemain(int petrol,int distance[],int capacity[])
	{
		
		if(petrol<=0)
		{
			return 0;
		}
		
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

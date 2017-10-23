package iterator;

public abstract class costCalculator {
	public float shipment(){
		float cost;
	for(int i =0;i<list.length();i++)
	{
		for (int j=0;j<=2;j++)
		{
			if(list[i][j+1]<=5)
			{
				cost=list[i][j+1]*0.75;
			}
			else
			{
				cost=list[i][j+1]*0.50;
			}
			
		}
		
	}return cost;
	}
}

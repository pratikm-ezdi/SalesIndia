package SalesTool;

public class SalesData
{
	int data[] = {0,4,42},i;
	public void display()
		{
			System.out.println("Data is as given below . . .");
			
			for (i=0;i<data.length;i++)
			{
				System.out.println("Next Data is : " + data[i]);
			}
		}
}

class EvnOdd5 
{
	public static void main(String[] args) 
	{
		int oCount = 0, eCount = 0;
		for (int i=0 ;i<args.length; i++)
		{
			int num = Integer.parseInt(args[i]);
			if(num%2==0)
			{
				eCount++;

			}
			else
			{
				oCount++;
			}
		}
		
			System.out.println("Even num =  "+eCount);
			System.out.println("Odd num =  "+oCount);

		}
		
	}


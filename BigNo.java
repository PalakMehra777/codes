//Q2. WAP to find biggest of 3 numbers
class BigNo
{
	public static void main(String[] args) 
	{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			{
			if(num1>num2 && num1>num3)
				{		
				System.out.println("Biggest num is = "+num1);
				}
				if(num2>num1 && num2>num3)
				{		
				System.out.println("Biggest num is   "+num2);
				}
				if(num3>num1 && num3>num2)
				{		
				System.out.println("Biggest num is  "+num3);
				}
		}

	}


}
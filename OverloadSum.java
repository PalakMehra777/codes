class MainOverload
{
	public static void main(int a,int b)
	{
		System.out.println("Sum of two Integer numbers = " +(a+b));
		System.out.println("Sum of two Integer numbers = " +(a-b));
	}
	public static void main(float f, float f1)
	{
		System.out.println("Sum of two Float numbers = "+(f+f1));
	}
	public static void main(double d,double d1)
	{
		System.out.println("Sum of two Double numbers = "+(d+d1));
	}
	
}

class OverloadSum
{
	public static void main(String[] args) 
	{
		MainOverload.main(4,6);
		MainOverload.main(10f,20f);
		MainOverload.main(12.12,24.35);

	}
}

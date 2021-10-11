class A  
{
	public static int id;
	public static double marks;

	public void m1()
	{

	}

	public void m1(int id)
	{
        this.id = id;
	}

	public void m1(double marks)
	{
		this.marks = marks;
	}

	public void m1(int id, double marks)
	{
		this.id = id;
		this.marks = marks;
	}
}

class Statoverload
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1(10);
		System.out.println("id ="+a.id);
		a.m1(258.26);
		System.out.println("marks ="+a.marks);
		a.m1(256,2658.25);
		System.out.println("id ="+a.id);
		System.out.println("marks ="+a.marks);
	}
}
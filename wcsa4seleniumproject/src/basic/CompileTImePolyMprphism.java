package basic;

public class CompileTImePolyMprphism {
	public static int select(int x)
	{
		return x;
		
	}
	public static int select(int x,int y)
	{
		return y;
		
	}
	public static int select(int x,int y,int z)
	{
		return x+y+z;
		
	}
	public static double select(double a,double b)
	{
		return a-b;
		
		
	}
	public static float select(float z)
	{
		return z;
		
	}
	public static void main(String[] args) 
	{
		int sum=select(10,20,30);
		System.out.println("the sum of three numberis:"+sum);
		
	}
	
}


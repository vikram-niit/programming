public class Factorial
{
	
	public static void main(String[] args)
	{
		Integer factorial = new Factorial().fact(5);
		
		System.out.println("fact="+factorial);
	}
	
	public Integer fact(Integer n)
	{
		if(n!=0)
			return n * fact(n-1);
		return 1;
	}
}

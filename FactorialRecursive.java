// Varun Ravi
// FactorialRecursive.java
//

public class FactorialRecursive implements Factorial 
{

	public FactorialRecursive(){}

	public int factorial(int n)
	{
		if (n == 1 || n == 0)
			return 1;

		return n * factorial(n-1);
	}

}




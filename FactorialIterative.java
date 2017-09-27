// Varun Ravi
// FactorialIterative.java
//

public class FactorialIterative implements Factorial 
{
	public FactorialIterative(){}

	public int factorial(int n)
	{
		int sol = 1;

		if (n == 0 || n == 1)
			return 1;

		for (int i = 2; i <= n; i++)
			sol = sol * i;
	
		return sol;
	}
}


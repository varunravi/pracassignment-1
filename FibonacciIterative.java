// Varun Ravi
// FibonacciIterative.java


public class FibonacciIterative implements Fibonacci 
{

	public FibonacciIterative(){}

	public int fibonacci(int n)
	{
		int temp = 0;
		int sol = 1;
		int temp1;

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		for (int i = 2; i <= n; i++)
		{
			temp1 = sol;
			sol = sol + temp;
			temp = temp1;
		}
		
		return sol;

	}

}
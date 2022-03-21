package week1.day1;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=1; i<=range; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			
		}
	}
}
// Assign second number to the first number

// Assign sum to the second number

// print sum
// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13

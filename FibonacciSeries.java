package week1.day1;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		if(range>=1)
			System.out.println(firstNum);
		if(range>=2)
			System.out.println(secNum);
		for(int i=2;i<range;++i)
		{
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}
}
// Assign second number to the first number

// Assign sum to the second number

// print sum
// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13

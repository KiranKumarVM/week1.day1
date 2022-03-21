package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int number= 2;
		boolean flag=true;
		for(int i=2; i<=number/2; i++)
		{
			if(number%i ==0)
			{
			System.out.println("not prime number");
			flag= false;
			break;
		    }
		}
	if(flag)
		System.out.println("prime number");
	}

}

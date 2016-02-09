class ChkPrimeNum 
{
ChkPrimeNum(int num)
{
	int j; 
	boolean b_prime_flg_v = true;
	for (j=2;j<=num;j++)
	{
		if (num%j==0 && j!=num)
		{
			b_prime_flg_v = false;
			break;
		}
	}
	if (b_prime_flg_v==true)
	{	
		System.out.println(num+" is a Prime Number");		
	}
	else
	{
		System.out.println(num+" is not a Prime Number");
	}
}
}
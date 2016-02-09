import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChkPrimeNumMain {
public static void main(String[] args)
{
	int num = 0;
	BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
	try 
	{
		System.out.print("Enter a Number :");
		num = Integer.parseInt(ins.readLine());
	} catch (IOException e) 
	{
	}
	
	ChkPrimeNum cpn = new ChkPrimeNum(num);
}
}
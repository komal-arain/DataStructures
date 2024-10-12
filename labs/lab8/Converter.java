package labs.lab8;
import java .util.Scanner;


class Converter 
{
	
	
	static int find(int decimal_number)
	{
		if (decimal_number == 0) 
			return 0; 
			
		else
		
		return (decimal_number % 2 + 10 * 
				find(decimal_number / 2));
	}
	

public static void main(String args[])
{

    Scanner s=new Scanner (System.in);
    System.out.println("give a no ");
	int decimal_number = s.nextInt();
   
	System.out.println(find(decimal_number));
}

}



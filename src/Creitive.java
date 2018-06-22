import java.util.Scanner;

public class Creitive {

	
	
	//First task  Time needed :15  minutes 
	public void printAnswer()
	{
		
		for(int i =1;i<=100;i++)
		{
			
		if(i%3==0 && i%5==0){
		
			System.out.println("DevOps");
		
		}else if(i%3==0)
		{
			System.out.println("Dev");
		
		}else if(i%5==0)
		{
			System.out.println("Ops");
		
		}else 
		{
			System.out.println(""+i);
		}}}
	
	//Second task Factorial 15 min;
	
public 	int fact (int n ){
		
	
	int output;
	
	if(n==1)
	{
		return 1;
		
	}
	
	//Recursion 
	output=fact(n-1)*n;
	
	return output;}
	
	
	
	
//Third task Check if a number is prime or Composite time: 10 min 
public String isPrimer(int n )
{
	for(int i =2 ;i<n;i++)
	{
		if(n%i==0)
	
			return "Composite";
			
	}	
		
		return "Prime number";	}





	public static void main(String[] args) { 

		
		Scanner input =  new Scanner (System.in);
		Creitive ob = new Creitive ();
		
			//sorted arrays 
		int arr[] = {1,2,5,8,11,15};
		int arr1[]={0,1,2,3,4,9,13,15};
		
		
		ob.printAnswer();
		
		

		System.out.println("Enter a number ");
		int num =input.nextInt();
		
		System.out.println("Factorical of a number "+num+" is "+ob.fact(num));
		
		
		System.out.println("Enter a number to see if its prime :");
		int prime = input.nextInt();
		
		System.out.println("Number "+prime+"is     "+ob.isPrimer(prime));
		
		
		
		
		
		
		
		
		
		
	

		

	}

}

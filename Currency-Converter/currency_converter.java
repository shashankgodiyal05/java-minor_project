import java.util.Scanner;

class choices
{
	void from(){
		System.out.println ("Select the currency you want to convert : ");
		System.out.println ("1. U.S. Dollar(USD).");
		System.out.println ("2. Indian Rupees(INR).");
		System.out.println ("3. Canadian Dollar(CAD).");
		System.out.println ("4. Pakistani Rupee(PKR).");
	}
	
	void to(){
		System.out.println ("Select the currency in which you want to convert : ");
		System.out.println ("1. U.S. Dollar(USD).");
		System.out.println ("2. Indian Rupees(INR).");
		System.out.println ("3. Canadian Dollar(CAD).");
		System.out.println ("4. Pakistani Rupee(PKR).");
	}
}


class convert
{
	Scanner sc = new Scanner(System.in);
	float converter(int c1, int c2)
	{
		float result = 0.0f;
		float value = sc.nextFloat();
		if(c1==1 && c2==1)
		{
			float convRate = 1.00f;
			result = value * convRate;
			System.out.println(value + " USD = "; + result + " USD ");
		}

		else if(c1==1 && c2==2)
		{
			float convRate = 75.00f;
			result = value * convRate;
			System.out.println(value + " USD = " + result + " INR ");
		}
		
		else if(c1==1 && c2==3)
		{
			float convRate = 59.30f;
			result = value * convRate;
			System.out.println(value + " USD = " + result + " CAD ");
		}
		
		else if(c1==1 && c2==4)
		{
			float convRate = 160.65f;
			result = value * convRate;
			System.out.println(value + " USD = " + result + " PKR ");
		}
		
		else if(c1==2 && c2==1)
		{
			float convRate = 0.013f;
			result = value * convRate;
			System.out.println(value + " INR = " + result + " USD ");
		}
		
		else if(c1==2 && c2==2)
		{
			float convRate = 1.00f;
			result = value * convRate;
			System.out.println(value + " INR = " + result + " INR ");
		}
		
		else if(c1==2 && c2==3)
		{
			float convRate = 0.017f;
			result = value * convRate;
			System.out.println(value + " INR = " + result + " CAD ");
		}
		
		else if(c1==2 && c2==4)
		{
			float convRate = 2.16f;
			result = value * convRate;
			System.out.println(value + " INR = " + result + " PKR ");
		}
		
		else if(c1==3 && c2==1)
		{
			float convRate = 0.80f;
			result = value * convRate;
			System.out.println(value + " CAD = " + result + " USD ");
		}
		
		else if(c1==3 && c2==2)
		{
			float convRate = 59.23f;
			result = value * convRate;
			System.out.println(value + " CAD =  " + result + " INR. ");
		}
		
		else if(c1==3 && c2==3)
		{
			float convRate = 1.00f;
			result = value * convRate;
			System.out.println(value + " CAD = " + result + " CAD ");
		}
		
		else if(c1==3 && c2==4)
		{
			float convRate = 127.83f;
			result = value * convRate;
			System.out.println(value + " CAD = " + result + " PKR ");
		}
		
		else if(c1==4 && c2==1)
		{
			float convRate = 0.0062f;
			result = value * convRate;
			System.out.println(value + " PKR " + result + " USD ");
		}
		
		else if(c1==4 && c2==2)
		{
			float convRate = 0.46f;
			result = value * convRate;
			System.out.println(value + " PKR = " + result + " INR ");
		}
		
		else if(c1==4 && c2==3)
		{
			float convRate = 0.0078f;
			result = value * convRate;
			System.out.println(value + " PKR = " + result + " CAD ");
		}
		
		else if(c1==4 && c2==4)
		{
			float convRate = 1.00f;
			result = value * convRate;
			System.out.println(value + " PKR " + result + " PKR ");
		}
		
		else{
	
		}

		return result;
	}
}


class currency_converter
{
	public static void main(String[] args) 
	{
		choices ch = new choices();
		convert conv = new convert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Currency Converter ");
		System.out.println("Whenever you want to EXIT from it PRESS 111 and ENTER.\n\n");
	
		while (true) 
		{
			ch.from();
			System.out.println (" ");
			System.out.println ("Enter your choice : ");
			int choice1 = sc.nextInt();
	
			if(choice1 == 111)
			{
			break;
			}
			System.out.println("You have selected option " + choice1);

			ch.to();
			System.out.println("Enter your choice : ");
			int choice2 = sc.nextInt();
	
			if(choice1 == 111)
			{
				break;
			}
	
			System.out.println("You have selected option " + choice2);
			System.out.println("\n Enter the value you want to convert : ");
			conv.converter(choice1, choice2);
		}
	
		System.out.println("\n\n\nThank's for using the application.......");
	}
}

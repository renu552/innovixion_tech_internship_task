//Calculator.java


public class Calculator {
	public static void main(String[] args)
	{
		int result;
	
	System.out.println("Enter first num");
	int Num1=Integer.parseInt(args[0]);
	System.out.println("Enter second num");
	int Num2=Integer.parseInt(args[1]);

	char operator=args[2].charAt(0);

	switch(operator) {
	
	case '+':
		result=Num1+Num2;
		System.out.println(Num1 +"+"+ Num2 + "=" +result);
		break;
		
	case '-':
		result=Num1-Num2;
		System.out.println(Num1 +"-"+ Num2 + "=" +result);
		break;
		
	case '*':
		result=Num1*Num2;
		System.out.println(Num1 +"*"+ Num2 + "=" +result);
		break;
		
	case '/':
		result=Num1/Num2;
		System.out.println(Num1 +"/"+ Num2 + "=" +result);
		break;
		
		default:
			System.out.println("Invalid operator!");
			
		break;
	}
	
	}
}

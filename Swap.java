//swapping 2 numbers with and without 3rd variable 

public class Swap{
	public static void main(String args[]){
	int a=10,b=20,temp;
		
		System.out.println("Before Swap");
		System.out.println("A is "+a+" B is "+b);
		

temp=a;
a=b;
b=temp;

		System.out.println("After Swap with 3rd variable");
		System.out.println("A is "+a+" B is "+b);

a=a+b;
b=a-b;
a=a-b;
		System.out.println("After Swap without 3rd variable");
		System.out.println("A is "+a+" B is "+b);

	}
} 
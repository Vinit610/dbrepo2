import java.util.*;
public class calc{
	static double add(int x,int y){
		return (double)x+y;
	}
	static double subtract(int x,int y){
		return (double)x-y;
	}
	static double multiply(int x,int y){
		return (double)x*y;
	}
	static double divide(int x,int y){
		return (double)x/y;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println("Enter the type of operation");
		String operation = in.next();
		double result = 0;
		switch(operation){
		case "add": result = add(x,y);
		break;
		case "sub": result = subtract(x,y);
		break;
		case "mul": result = multiply(x,y);
		break;
		case "div": result = divide(x,y);
		break;
		}
		System.out.println("The result is:" +result);
	}
}
		
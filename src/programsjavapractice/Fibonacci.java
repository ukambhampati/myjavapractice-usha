package programsjavapractice;
import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fibonacci.fibser(5);
		for(int i=0;i<5;i++) {
			Fibonacci.recfib(i);
		}
	}
	
	public static ArrayList<Integer> fibonacci(int num) {
		
		ArrayList<Integer> fibobnacci =  new ArrayList<>();
		int start = 0;
		int second = 1;
		int total = 0;
		fibobnacci.add(start);
		fibobnacci.add(second);
		while (fibobnacci.size() < num) {
			total = start+second;
			fibobnacci.add(total);
			start = second;
			second = total;
		}
		return fibobnacci;
	}
	
	public static void fib(int num) {
		int num1 =0;
		int num2 = 1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int i=1;i<=num-2;i++) {
			int sum = num1 + num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}
		
	}
	
	public static void fibser(int num) {
		
		int num1=0;
		int num2=1;
		int num3 = 0;
		for (int i=0;i<num;i++) {
			System.out.print(num1+" ");
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			
		}
	}
	
	public static int recfib(int num) {
		
		if (num <=1) {
			return num;
		}
		
		return recfib(num-1)+recfib(num-2);
	}
	
}

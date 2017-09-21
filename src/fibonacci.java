import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("please follow the fibonacci sequence and enter the next number\nplease do without calculator");
		boolean correct = true;
		int a = 0;
		int b = 1;
		int got, num;
		System.out.println("1");
		do {
			got = sc.nextInt();  
			num = a + b;
			if (got == (a + b)) {
				a =b;
				b=got;
			} else {
				correct = false;
			}
			
		} while ( correct == true);
		System.out.println("you have lost the correct number is " + num);
	}
}

package JatTask5;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int largest;
		if(num1>=num2 && num1>=num3) {
			largest=num1;
		}
		else if(num2>=num1 && num2>=num3) {
			largest=num2;
		}
		else{
			largest=num3;
		}
		System.out.println(largest);
		sc.close();
	}

}

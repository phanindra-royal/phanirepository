package sdet;
import java.util.Scanner;
class Reverse_number{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		int num=scan.nextInt();
		scan.close();
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		Thread.sleep(1200);
		System.out.println("your number in reverse mode is:");
		Thread.sleep(1200);
		System.out.println("PLEASE WAIT IT IS IN PROCESS");
		Thread.sleep(1200);
		System.out.println(rev);
		Thread.sleep(120);
		System.out.println("DONE WITH YOUR PROCESS");
		
	}
}

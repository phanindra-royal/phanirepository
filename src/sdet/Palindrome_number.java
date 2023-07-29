package sdet;

public class Palindrome_number {
public static void main(String[] args) {
	int num=131;
	int original=num;
	System.out.println(num);
	int rev=0;
	
	//<reverse>
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	//</reverse>
	System.out.println(rev);
	if(original==rev) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
	
}
}

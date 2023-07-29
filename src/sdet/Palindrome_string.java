package sdet;

public class Palindrome_string {
public static void main(String[] args) {
	String name="madam";
	String originalname=name;
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	if(originalname.equals(rev)) {
		System.out.println("string is palindromme");
	}
	else {
		System.out.println("string is not a palindrome");
	}
}
}

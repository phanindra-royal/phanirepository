package sdet;

public class Largest_last_three {
	static int a,b,c;
	static void firstLargests() {
		if(a>b&&a>c) {
			System.out.println("a is first bigger number==>"+a);
		}
		else if(b>a&&b>c) {
			System.out.println("b is bigger number==>"+b);
		}
		else {
			System.out.println("c is bigger number"+"==>"+c);
		}
	}
	
public static void main(String[] args) {
	a=22222;
	b=2200;
	c=300;
	firstLargests();
	
}
}

package sdet;

public class Swap_temp {
public static void main(String[] args) {
	int a =100;
	int b= 200;
	System.out.println("values before swapping are");
	System.out.println("a"+"==>"+a);
	System.out.println("b"+"==>"+b);
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	System.out.println("values after swapping are");
	System.out.println("a"+"==>"+a);
	System.out.println("b"+"==>"+b);
}
}

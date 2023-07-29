package sdet;

public class Swap_without_temp {
public static void main(String[] args) {
	int a=100;
	int b=200;
	System.out.println("values before swapping are");
	System.out.println("a"+"==>"+a);
	System.out.println("b"+"==>"+b);
	System.out.println("after swapping values are");
	a=a+b;  //100+200===>300
	b=a-b;	//300-200===>100
	a=a-b;	//300-100===>200
	System.out.println("a"+"==>"+a);
	System.out.println("b"+"==>"+b);
}
}

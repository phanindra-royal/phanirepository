package sdet;

public class Count_even_odd_numbers {
public static void main(String[] args) {
//	int num=246813579;
//	
	int evencount=0;
	int oddcount=0;
//	while(num>=0) {
//		int rem=num%10;
//		if(rem%2==0) {
//			evencount++;
//		}
//		else {
//			oddcount++;
//		}
//		num=num/10;
//	}
//	System.out.println("even number"+"==>"+ evencount);
//	System.out.println("odd number"+"==>"+oddcount);
	String num="123456789";
	for(int i=num.length()-1;i!=0;i--) {
		if(num.charAt(i)%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
	}
	System.out.println(evencount+" and "+oddcount);	
}
}

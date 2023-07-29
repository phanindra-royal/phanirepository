package sdet;

public class CountANumber {
public static void main(String[] args) {
//	int var=1234;
//	int count=0;
//	while(var>0) {
//		var=var/10;
//		count++;	
//	}
//	System.out.println(count);
	
	String num="00000";
	int count=0;
	for(int i=num.length()-1;i>=0;i--) {
		count++;
	}
	System.out.println(count);
}
}

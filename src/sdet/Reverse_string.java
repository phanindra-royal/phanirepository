package sdet;

public class Reverse_string {
public static void main(String[] args) {
	//using toCharArray() method
	String var ="phanindra";
	String revs="";
//	char[] var1=var.toCharArray();
//	int num=var1.length;
//	System.out.println(num);
//	for(int i=var1.length-1;i>=0;i--) {
//		System.out.print(var1[i]);
//	}
	
	//using concatination 
	for(int i=var.length()-1;i>=0;i--) {
		revs=revs+var.charAt(i);
	}
	System.out.println(revs);
	
	
	
}
}

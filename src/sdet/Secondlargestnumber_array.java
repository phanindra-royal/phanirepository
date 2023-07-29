package sdet;



public class Secondlargestnumber_array {
public static void main(String[] args) {
	int arr[]= {9,7,5,3,4,6,8};
	int max=arr[0];
	int largest=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
	 largest=arr[i];
		}
	}
	if(largest==0) {
		System.out.println(max);
	}
	else {
		System.out.println(largest);
	}
}
}

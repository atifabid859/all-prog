package com.java_peoject;

public class palindrom {

	public static void main(String[] args) {
		int num=0,n=121, temp=0,r=0; 
		num=n;
		while(n>0) {
			temp=n%10;
		r=(r*10)+temp;
		n=n/10;
		}
		if(num==r) {
			System.out.println(r+"palindrom number");
		}else {
			System.out.println("not a palindrom number");
		}
	}
}

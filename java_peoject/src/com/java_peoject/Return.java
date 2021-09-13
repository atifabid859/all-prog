package com.java_peoject;

public class Return {
public static void main(String[] args) {

	Return return1 = new Return();
	return1.show(10, 20);
}
public int show(int a,int b) {
	int sum=a+b;
	System.out.println(sum);
	return sum;
}
}

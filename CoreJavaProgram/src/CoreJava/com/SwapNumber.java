package CoreJava.com;

public class SwapNumber {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before time value "+"a="+a+" b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After time value "+"a="+a+" b="+b);
}
}

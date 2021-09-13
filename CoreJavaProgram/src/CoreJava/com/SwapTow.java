package CoreJava.com;

public class SwapTow {
public static void main(String[] args) {
	int a=10,b=20,c=0;
	System.out.println("Before a and b value and c value =0 "+"a="+a+" b="+b);
	c=a+b;
	b=c-b;
	a=c-a;
	System.out.println("After a and b value and c value =0 "+"a="+a+" b="+b);
}
}

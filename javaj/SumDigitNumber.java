class SumDigitNumber{
	public static void main(String[] args) {
		int n=1234,a=0,b=0;
		for (int i=1;i<=5;i++ ) {
			b=n%10;
			a=a+b;
			n=n/10;
			System.out.println(a);
		}

	}
}
class Palindrom{
	public static void main(String[] args) {
		int n=212,num=0,temp=0,i=0;
		temp=n;
		while (n>0) {
			i=n%10;
			num=(num*10)+i;
			n=n/10;
		}
		if (num==temp) {
			System.out.print("palindrom number");
		}
		else {
			System.out.print("not a palindrom number");
		}
	}
}
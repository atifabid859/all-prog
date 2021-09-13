import java.util.Scanner;
class StringPalindrome{
	public static void main(String[] args) {
		String num,s="";
		Scanner sc=new Scanner(System.in);
				
System.out.print("Stirn check is a palindrom number");

		num=sc.nextLine();

        int length=num.length();
		for(int i=length-1;i>=0;i--){	
		s=s+num.charAt(i);
	}
	if (num.equals(s)) {
		System.out.print("String palindrome");
	}
	
	else {
		System.out.print("String is not a palindrome");
	}
	
	}
}
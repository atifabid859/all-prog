class StringRevers{
	public static void main(String[] args) {
		String num="mom";
		String revers="";
		int length=num.length();
		//char [] ch=num.toCharArray();
		for(int i=length-1;i>=0;i--){
			revers=revers+num.charAt(i);
		}
		if (revers.equals(num)) {
			System.out.print("pilandrom number");
		}
		else{
			System.out.println("not a pilandrom");
		}
	}
}
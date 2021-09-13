package CoreJava.com;

public class Methods {
	int id;
	String name;
	int age;

void show(int i,String n) {
	id=i;
	name=n;
	System.out.println(id+""+name+""+age);
}
public static void main(String[] args) {
	Methods m=new Methods();
	m.show(101, "Atif");
	Methods m1=new Methods();
	m1.show(102, "sakib");
}
}
	



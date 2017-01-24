package pl.koralez.main;

public class HelloWorld {

	public static void main(String[] args) {
	String hello = "Hello ";
	User user = new User();
	
	user.setName("Pietrek");
	
	System.out.println(hello + user.getName());

	}

}

package InterfaceRealLife;

public class Main {

	public static void main(String[] args) {
		
		SignUpManager signUp = new SignUpManager(new UserAgeCheckService());
		signUp.signUp(new User(1, "Furkan", 17));
		
		SignUpManager signUp2 = new SignUpManager(new ComplexUserCheckService());
		signUp2.signUp(new User( 2, "Mehmet", 19 ));
	}

}

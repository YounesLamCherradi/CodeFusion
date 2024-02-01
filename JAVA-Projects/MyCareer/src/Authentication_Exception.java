package EXCEPTIONS;

// As you mentioned in TASK1:
// This Custom exception has a recovery behavior.
public class Authentication_Exception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String login;
	public String password;
	public Authentication_Exception(String login,String password) {
		super("the email"+login+"password"+password+"are in correct");
	}
	public static void Authentication_Case() {
			System.out.println("Sorry but we do not have any User with this name");
			System.out.println("You should make sure that you have the corect credentials");
	}
	
	
	
	

	
	
	
}

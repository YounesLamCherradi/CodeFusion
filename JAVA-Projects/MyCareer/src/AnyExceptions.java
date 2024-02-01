package EXCEPTIONS;


// As you mentioned in TASK1:
// This method does not have a recovery.
public class AnyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      public AnyException(String message) {
  //  	  super(" Please this class is related to AnyException");
    	  super(message);
      }	
      
   
}

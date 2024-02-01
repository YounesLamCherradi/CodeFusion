package EXCEPTIONS;

import java.util.ArrayList;
import java.util.Collections;

import INBOX.Message;

public class NotFoundForRemoving extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  public NotFoundForRemoving() {
	  super("We cannot found this object. SO WE CANNOT DELETE IT");
  }
  public static void ThePotentialLocation(ArrayList<Message> arr, Message x) {
	  
		int a= Collections.binarySearch(arr,x);
		if(a<=0)
			System.out.println("The element can be found at Index:"+ ((a-1)));
		
	}
	  
  
 
}

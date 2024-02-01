package INBOX;
import java.util.Comparator;
import java.util.GregorianCalendar;
import INBOX.*;
import POST.Post;
import ACCOUNT.*;
public class Message implements Comparable<Message> {

	public GregorianCalendar Date_time;
	public String Message;
	
	

	public Message(GregorianCalendar date_time, String message) {
		Date_time = date_time;
		Message = message;
	}

	@Override
	public String toString() {
		return "Message [Date_time=" + Date_time + ", Message=" + Message + "]";
	}
//	@Override
	//public int compareTo(Message o) {
		//if(this.compareTo(o)>0)
		  // return 1;
		   //else if(this.compareTo(o)<0) 
			 //  return -1;
		   //else
			   //return 0;	   
	//}

	@Override
	public int compareTo(Message o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

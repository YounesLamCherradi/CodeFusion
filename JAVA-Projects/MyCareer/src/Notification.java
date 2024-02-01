package NOTIFICATION;
import java.util.GregorianCalendar;
import ACCOUNT.*;
import INBOX.Message;
import POST.*;
public class Notification implements Comparable<Notification> {
	
	public GregorianCalendar  Date_time;
	public String Text;
	public Account account;
	public Notification_center notifi_center;
	public Post post;
	
	public Notification(GregorianCalendar date_time, String text) {
		Date_time = date_time;
		Text = text;
	}

	@Override
	public String toString() {
		return "Notification [Date_time=" + Date_time + ", Text=" + Text + "]";
	}

	public static void add(Notification p) {
		
	}
	@Override
	public int compareTo(Notification o) {
		if(this.compareTo(o)>0)
		   return 1;
		   else if(this.compareTo(o)<0) 
			   return -1;
		   else
			   return 0;	   
	}
}

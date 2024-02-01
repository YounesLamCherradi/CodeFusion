package NOTIFICATION;

import java.util.ArrayList;

import EXCEPTIONS.NotFoundForRemoving;

public class Notification_center {

	ArrayList<Notification> notification=new ArrayList<Notification>();
	
	public void View_notifications() {	
		System.out.println(notification);
	}
	public void Remove_notif(Notification notifica) throws NotFoundForRemoving {
		for(int i=0; i<notification.size();i++) {
			if(notification.get(i).equals(notifica)){
				System.out.println("The student"+notification.get(i)+ "is deleted successfully");
				notification.remove(notification.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
		
	}
	
}

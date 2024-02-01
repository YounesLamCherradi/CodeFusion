package POST;
import java.util.ArrayList;
import java.util.Collections;

import ACCOUNT.*;
import EXCEPTIONS.NotFoundForRemoving;
import INBOX.Message;

import java.util.GregorianCalendar;

import NOTIFICATION.Notification;
public class Post implements Comparable<Post>{
	
	public GregorianCalendar Date_time;
    public String Post;
    int NumberOfLikes=0;
    public ArrayList<Notification> notification= new ArrayList<>(); 
    public ArrayList<Thread> thread= new ArrayList<>(); 
    public ArrayList<Hashtag> hashtag= new ArrayList<>(); 
    public Account account;
    
	public Post(GregorianCalendar date_time, String post) {
		Date_time = date_time;
		Post = post;
	}
	public void Like(){
		++NumberOfLikes;
    }
    public void Search(Notification noti) {
        int a=0;
	     a= Collections.binarySearch(notification,noti);
	     if(a>=0)
		     System.out.println("The element is found at Index:"+a);
	     else
		     System.out.println("The element is not found at Index:"+ a);
	}

	@Override
	public String toString() {
		return "Post [Date_time=" + Date_time + ", Post=" + Post + "]";
	}
	// I implement all the COLLECTIONS BEHAVIORS  
	public  void Add_Notification(Notification p) {
		notification.add(p);
	}
	public  void Add_Hashtag(Hashtag p) {
		hashtag.add(p);
	}
	public  void Add_To_Thread(Thread p) {
		thread.add(p);
	}
	//I implement all the REMOVE METHODS
	public  void Remove_Hashtag(Hashtag p) throws NotFoundForRemoving{
		
		for(int i=0; i<hashtag.size();i++) {
			if(hashtag.get(i).equals(p)){
				System.out.println("The student"+hashtag.get(i)+ "is deleted successfully");
				hashtag.remove(hashtag.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
		
	}
	public  void Remove_From_Thread(Thread p) throws NotFoundForRemoving{
		
		
		for(int i=0; i<thread.size();i++) {
			if(thread.get(i).equals(p)){
				System.out.println("The student"+thread.get(i)+ "is deleted successfully");
				thread.remove(thread.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
	}
	// I print all the Lists that I have in this class as you mentioned in TASK2:
		// toString() to print 
		//all the elements of the collection.
		public  void Print_All_Threads() {
			System.out.println(thread);
		}
		public  void Print_All_Notifications() {
			System.out.println(notification);
		}
		public  void Print_All_Hashtag( ) {
			System.out.println(hashtag);
		}
		@Override
		public int compareTo(Post o) {
			if(this.Post.compareTo(Post)>0)
			   return 1;
			   else if(this.Post.compareTo(Post)<0) 
				   return -1;
			   else
				   return 0;	   
		}
	
    
}

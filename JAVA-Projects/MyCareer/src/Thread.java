package POST;
import java.util.ArrayList;
import java.util.Collections;

import ACCOUNT.*;
import EXCEPTIONS.NotFoundForRemoving;
import INBOX.Message;

public class Thread implements Comparable<Thread> {

	public Account acount;
	public ArrayList<Post> posts=new ArrayList<Post>();
	
	
	public Thread(Account acount) {
		this.acount = acount;
	}
	
	// Viewing the whole POST COLLECTION
	public void View_posts() {
		System.out.println(posts);
	}
	//Sorting the whole POST COLLECTION
	public void Sort_posts() {
		Collections.sort(posts);
	}
	//removing A POST FORM THE POST COLLECTION
	public void Remove_post(Post p) throws NotFoundForRemoving {
		for(int i=0; i<posts.size();i++) {
			if(posts.get(i).equals(p)) {
				System.out.println("The student"+posts.get(i)+ "is deleted successfully");
				posts.remove(posts.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
	}
	@Override
	public int compareTo(Thread o) {
		if(this.compareTo(o)>0)
		   return 1;
		   else if(this.compareTo(o)<0) 
			   return -1;
		   else
			   return 0;	   
	}
	
}

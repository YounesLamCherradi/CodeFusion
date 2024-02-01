package ACCOUNT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import EXCEPTIONS.Authentication_Exception;
import EXCEPTIONS.NotFoundForRemoving;
import INBOX.*;
import POST.*;
import POST.Thread;
import NOTIFICATION.*;

public class Account {
	
	private String Login;
	private String Password;
	public ArrayList<Message> message= new ArrayList<>(); 
	public ArrayList<Post> post= new ArrayList<>(); 
	public ArrayList<Thread> thread= new ArrayList<>(); 
	public ArrayList<Notification> notification= new ArrayList<>();
	public Company company;
	
	public Account(String login, String password) {
		Login = login;
		Password = password;
	}
	// function to check Authentication & I make throw an Exception 
	//as you mentioned in TASK1: Add  two  custom  exceptions  to  your  solution.
	//At  least  one  of  the  exceptions  should  have  a  recovery 
	public void Authenticate(String login, String password) throws Authentication_Exception{
		 if(Login.compareTo(login)==0 && Password.compareTo(password)==0) 
	    	  System.out.println("Welcome to your account ");
      else
    	         throw new Authentication_Exception(login,password);
		
		
	}
	
	//Change the password method to change your your PASSWORD
	public void Change_pass(String newpassword,String currentpass) {
		if(Password.equals(currentpass)) {
			Password=newpassword;
		    System.out.println("you have successfully change your password");}
		else
		    System.out.println("Sorry you password is incorrect, thereby you cannot change your password");

	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Account [Login=" + Login + ", Password=" + Password + "]";
	}
	//////////////////////////////////// I implement all the ADD METHODS/////////////////////////////////////  
	public  void Add_Message(Message x) {
		message.add(x);
	}
	public  void Add_Post(Post p) {
		post.add(p);
	}
	public  void Add_To_Thread(Thread p) {
		thread.add(p);
	}
	public  void Add_Notification(Notification p) {
		notification.add(p);
	}
	
	/////////////////////////////////////I implement all the REMOVE METHODS///////////////////////////////////
	public  void Remove_Message(Message x) throws NotFoundForRemoving {
		for(int i=0; i<message.size();i++) {
			if(message.get(i).equals(x)){
				System.out.println("The student"+message.get(i)+ "is deleted successfully");
				message.remove(message.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
		
	}
	public  void Remove_Post(Post p) throws NotFoundForRemoving {
		for(int i=0; i<post.size();i++) {
			if(post.get(i).equals(p)) {
				System.out.println("The student"+post.get(i)+ "is deleted successfully");
				post.remove(post.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
	}
	public  void Remove_From_Thread(Thread p) throws NotFoundForRemoving {
		for(int i=0; i<thread.size();i++) {
			if(thread.get(i).equals(p)) {
				System.out.println("The student"+thread.get(i)+ "is deleted successfully");
				thread.remove(thread.get(i));
			    break;}
		}
		throw new NotFoundForRemoving();
	}
	
	////////////////////////////////////// I implement all the SORT METHODS////////////////////////////////////// 
	public  void Sort_Messages() {
		Collections.sort(message);
	}
	
	public  void Sort_Posts() {
		Collections.sort(post);
	}
	public  void Sort_Thread_( ) {
		Collections.sort(thread);
	}
	public  void Sort_Notification() {
		Collections.sort(notification);
	}
	
	/////////////////////////////// I implement all the possible Search method////////////////////////////////
	///////////////////////////////as you mentioned in TASK1://///////////////////////////////////////////////
	public  void Search_Message(Message x) {
		int a=0;
		a= Collections.binarySearch(message,x);
		if(a>=0)
			System.out.println("The element is found at Index:"+a);
		else
			System.out.println("The element is not found at Index:"+a);
	}
	public  void Search_Post(Post p) {
	     int a=0;
	     a= Collections.binarySearch(post,p);
	     if(a>=0)
		     System.out.println("The element is found at Index:"+a);
	     else
		     System.out.println("The element is not found at Index:"+ a);
	}
	public  void Search_In_Thread(Thread p) {
		int a=0;
		a= Collections.binarySearch(thread,p);
		if(a>=0)
			System.out.println("The element is found at Index:"+a);
		else
			System.out.println("The element is not found at Index:"+ a);
	}
	public  void Search_Notification(Notification p) {
		int a=0;
		a= Collections.binarySearch(notification,p);
		if(a>=0)
			System.out.println("The element is found at Index:"+a);
		else
			System.out.println("The element is not found at Index:"+ a);
	}
	
	
	//////////////////////////// I print all the Lists that I have in this class as you mentioned in TASK2:////////
	///////////////////////////////////// toString() to print//////////////////////////////////////////////////// 
	////////////////////////////////////all the elements of the collection./////////////////////////////////////
	public  void Print_All_Messages() {
		System.out.println(message);
	}
	public  void Print_All_Posts() {
		System.out.println(post);
	}
	public  void Print_Everything_Thread_( ) {
		System.out.println(thread);
	}
	public  void Print_All_Notification() {
		System.out.println(notification);
	}
}


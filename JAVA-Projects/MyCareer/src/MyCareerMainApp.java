package USER;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

import ACCOUNT.*;
import EXCEPTIONS.Authentication_Exception;
import EXCEPTIONS.NotFoundForRemoving;
import INBOX.*;
import NOTIFICATION.*;
import POST.*;
import POST.Thread;
import EXCEPTIONS.*;


public class MyCareerApp {

	public static void main(String[] args) {
		///////////////////////////////////////Second deliverable Code//////////////////////////////////////////
		// Show how to scan in JAVA 
	    Scanner object=new Scanner(System.in);
		System.out.println("---------------------Welcome Please provide us with the following information-------------");
		System.out.println("PLEASE ENTER YOUR Name");
		String login= object.next();
		System.out.println("PLEASE ENTER YOUR Password");
		String password= object.next();
		// Creation of an instance of a class
		Account acc=new Account(login,password);
		System.out.println(acc);
		System.out.println("PLEASE ENTER YOUR EDUCATION");
		System.out.println("PLEASE ENTER YOUR EXPERIENCE");
		System.out.println("PLEASE ENTER YOUR SKILLS");
		Form form=new Form(object.next(),object.next(),object.next(),new Job_Op_Post(new GregorianCalendar(),"raja","dima",25.8,new GregorianCalendar()));
		//Printing the content of THE OBJECT FORM
		System.out.println(form);
		// Creation of an instance of the COMPANY OBJECT
		System.out.println("--------------------------------PLEASE ENTER THE COMAPNY NAME-----------------------");
		System.out.println("-----------------------PLEASE ENTER THE COMPANY DESCRIPTION-------------------------");
		System.out.println("----------------------PLEASE ENTER THE COMPANY ACTIVITY------------------------------");
		Company comp=new Company(object.next(),object.next(),object.next());
		System.out.println(comp.toString());
		/////////////////In the below code, I am trying to implement TRY-CATCH BLOCK by GETTING CREDENTIALS FROM THE USER
		///////////////// And checking authentication///////////////////////////////*/
		System.out.println("----------------LOGIN TO YOUR ACCOUNT-----------------------------");
		System.out.println("PLEASE ENTER YOUR LOGIN");
		System.out.println("PLEASE ENTER YOUR Password");
		String l=object.next();
		String p=object.next();
		System.out.println(l + p);
		System.out.println(login +password);
		
		/////////////////////////////DELIVERABLE 3333333333333333333333333333333333333333333/////////////////////////
		
		
		//////////// I demonstrate my understanding of the use of Exceptions using Try and Catch////////////
		//As well as I throw to satisfy the requirement of TASK1:Add  two  custom  exceptions  to  your  solution.
		////////At  least  one  of  the  exceptions  should  have  a  recovery behavior.////////////////////////////
		//////////////////////////////This is MY FIRST RECOVER CUSTOM EXCEPTION////////////////////////////////////
		try {
		acc.Authenticate(l,p);
		}
		catch(Authentication_Exception e) {
			//Here, I am calling a method in the custom exception that I created as you mentioned in TASK1
			Authentication_Exception.Authentication_Case();
		}
		
	
        
        ///////////////////////////////// In the below code I am manipulating the collections as stated in TASK3
        Account ac=new Account(object.next(),object.next());
        // I am filling the ArrayList with objects of type MESSAGE
        for(int i=0;i<5;i++) {
        	 Message mes1= new Message(new GregorianCalendar(),object.next());
        	ac.Add_Message(mes1);
        }
        // I am printing the content of the ARRAYLIST MESSAGE
        ac.Print_All_Messages();
      // I am showing you how we can use EXCEPTIONS with Collections AS stated in TASK1 & TASK3  
       Message test= new Message(new GregorianCalendar(),object.next());
      try {
    	  ac.Remove_Message(test);
      }
      catch(NotFoundForRemoving a)
      {
    	  NotFoundForRemoving.ThePotentialLocation(ac.message, test);
      }
      ////////// I demonstrate the use of Collections as Stated in TASK3:
      /////////  allow  the  manipulation  of  the collections.
      System.out.println("Please instantiate an Object of Type Account");
      Account acc1=new Account(object.next(),object.next());
      Thread thread=new Thread(acc1);
      thread.Sort_posts();
      ////////////I manipulate the HashMAP that takes as a KEY=Account---VALUE=iNTEGER(nUMBER OF posts an Account has)
      
      HashMap<Account,Integer> track=new HashMap<Account,Integer>();
      Account accout=new Account(object.next(),object.next());
    
    	 Account account1=new Account(object.next(),object.next());
    	 Account account2=new Account(object.next(),object.next());
    	 Account account3=new Account(object.next(),object.next());
    	  track.put(account1,object.nextInt());
    	  track.put(account2,object.nextInt());
    	  track.put(account3,object.nextInt());
      
      //Replacing an element in THE HashMap
      track.replace(account1,object.nextInt());
      //Printing the Values of the HashMap & THE kEYS OF THE HashMap
      System.out.println(track.values());
      System.out.println(track.keySet());
      
	}
	
	
	
	
	     
	    

}

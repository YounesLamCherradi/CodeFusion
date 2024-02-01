package EXCEPTIONS;

import java.util.HashMap;

import ACCOUNT.Account;

public class HashACCOUNTNumberOfPosts {

	HashMap<Account,Integer> track;
	
	public HashACCOUNTNumberOfPosts() {
		track=new HashMap<Account,Integer>();
	}
	//Modifying an element in THE HASHMAP
	public void Modify(Account acc,int numb ) {
		if(track.containsKey(acc))
		      track.replace(acc,numb);
		else
			System.out.println("Sorry we cannot modify"+acc+" becauce we did not find it");
	}
	// Printing the Values of A HASHMAP
	public void printValues() {
		System.out.println(track.values());
	}
	//Printing the Keys of A HASHMAP
	public void printKeys() {
		System.out.println(track.keySet());
	}
	
}

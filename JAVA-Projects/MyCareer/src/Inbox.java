package INBOX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inbox{

	public ArrayList<Message> mess=new ArrayList<>();
	
	///////////////////////////////// As you mentioned in TASK2://///////////////////////////////////////////////
	//////////////////////////////// I implement everything related to Searching an element/////////////////////
	
	public void Search_message(Message message) {
		int a=0;
		a= Collections.binarySearch(mess,message);
		if(a>=0)
			System.out.println("The element is found at Index:"+a);
		else
			System.out.println("The element is not found at Index:"+ a);		
	}
	//////////////////////////////////// As you mentioned in TASK2://///////////////////////////////////////
    /////////////////////////////////// I implement everything related to sorting the ArrayList mess.///////////
	public void Sort_messages() {
		Collections.sort(mess);
	}

	}



package ACCOUNT;

import java.util.ArrayList;

import POST.*;

public class Profile {
	
	public String Name;
	public int Age;
	public String Address;
	public String Email;
	public String Phone;
	public Educational_Info Edu_info;
	public Account account;
	public ArrayList<Form> form= new ArrayList<>(); 
	
	
	
	public Profile(String name, int age, String address, String email, String phone,Educational_Info Edu_info,Account account) {
		Name = name;
		Age = age;
		Address = address;
		Email = email;
		Phone = phone;
	    this.Edu_info=Edu_info;
	    this.account=account;
	  }

	public void Update_profile(String Name,int Age,String Email,String Phone) {
		this.Name=Name;
		this.Age=Age;
		this.Email=Email;
		this.Phone=Phone;
	}

	@Override
	public String toString() {
		return "Profile [Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", Email=" + Email + ", Phone="
				+ Phone + "]";
	}
	
	

}

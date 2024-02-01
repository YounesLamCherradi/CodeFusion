package ACCOUNT;

public class Company {

	public String Name;
	public String Description;
	public String Activity;
	public Company(String name, String description, String activity) {
		Name = name;
		Description = description;
		Activity = activity;
	}
	@Override
	public String toString() {
		return "Company [Name=" + Name + ", Description=" + Description + ", Activity=" + Activity + "]";
	}
	
	
	
	
	
	
}

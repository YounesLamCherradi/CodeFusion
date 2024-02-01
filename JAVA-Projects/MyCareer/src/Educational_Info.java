package ACCOUNT;

public class Educational_Info {

	public String Latest_degree;
	public String Discipline;
	public int Grad_year;
	public Profile profile;
	public Educational_Info(String latest_degree, String discipline, int grad_year,Profile profile) {
		Latest_degree = latest_degree;
		Discipline = discipline;
		Grad_year = grad_year;
		this.profile=profile;
	}
	
	public void Update_edu_info(String latest_degree,String discipline,int grad_year) {
		Latest_degree=latest_degree;
		Discipline=discipline;
		Grad_year=grad_year;
		
	}

	@Override
	public String toString() {
		return "Educational_Info [Latest_degree=" + Latest_degree + ", Discipline=" + Discipline + ", Grad_year="
				+ Grad_year + "]";
	}
	
	
	
}


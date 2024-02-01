package POST;
import ACCOUNT.*;
public class Form {

	public String Education;
	public String Experience;
	public String Skills;
	public Job_Op_Post job_openning;
	public Profile profile;
	public Form(String education, String experience, String skills,Job_Op_Post job_openning) {
		Education = education;
		Experience = experience;
		Skills = skills;
		this.job_openning=job_openning;
		
	}
	@Override
	public String toString() {
		return "Form [Education=" + Education + ", Experience=" + Experience + ", Skills=" + Skills + "]";
	}
	
	
	
}

package POST;

import java.util.GregorianCalendar;

public class Job_Op_Post extends Post {

	public String Job_title;
	public double Salary;
	public GregorianCalendar Start_date;
	
	public Job_Op_Post(GregorianCalendar date_time, String post, String job_title, double salary,
			GregorianCalendar start_date) {
		super(date_time, post);
		Job_title = job_title;
		Salary = salary;
		Start_date = start_date;
	}

	@Override
	public String toString() {
		return "Job_Op_Post [Job_title=" + Job_title + ", Salary=" + Salary + ", Start_date=" + Start_date + "]";
	}
	
	
}

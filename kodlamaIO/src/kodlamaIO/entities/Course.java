package kodlamaIO.entities;

public class Course {
	private int id;
	private String courseName;
	private double courseFee;
	public Course() {
		
	}
	public Course(int id, String courseName,double courseFee) {
		
		this.id = id;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	
	
}

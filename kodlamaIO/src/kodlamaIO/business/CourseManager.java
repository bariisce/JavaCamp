package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers,List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
		if(course.getCourseFee() < 0) {
			throw new Exception("Kurs Ücreti 0 dan küçük olamaz !");
		}
		
		for (Course c : courses) {
			if(c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Girdiğiniz Kurs adı zaten mevcut. Lütfen farklı bir kategori giriniz !");
			}
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}

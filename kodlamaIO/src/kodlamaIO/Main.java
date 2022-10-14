package kodlamaIO;


import java.util.ArrayList;
import java.util.List;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.FileLogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.HibernateCategoryDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.dataAccess.JdbcInstructorDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - Java",1750);
		Category category1 = new Category(1,"Programlama");
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");
		List<Course> courses = new ArrayList<Course>();
		List<Category> categories = new ArrayList<Category>();
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courses);
		courseManager.add(course1);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
		categoryManager.add(category1);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
	}

}

package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " +instructor.getLastName());
		}
	}
}

package oopWithNNLayeredApp.business;



import java.util.List;

import oopWithNNLayeredApp.core.logging.Logger;
import oopWithNNLayeredApp.dataAccess.CategoryDao;
import oopWithNNLayeredApp.dataAccess.InstructorDao;
import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers=loggers;
	}
	public void add(Instructor instructor) throws Exception {
		if(isValid(instructor)) {
			instructorDao.add(instructor);
			for (Logger logger : loggers) {
				logger.log( instructor.getId()+ " "+instructor.getName()+ " " +instructor.getName() +"\n");
				}
		} 
		else { throw new Exception("Hata");
		
		}
			
		}
	public boolean isValid(Instructor instructor) {
		
		List<Instructor> instructors=instructorDao.getAll();
		for (Instructor instructor2 : instructors) {
			if(instructor2.getName().equals(instructor.getName())) {
				return false;
			}
			
		}
		
		
		return true;
		
	}
	public void update(Instructor instructor,int id) throws Exception {
		if(isValid(instructor)) {
			instructorDao.update(instructor, id);
		}
		else {
			throw new Exception("Hata");
		}
	}
	}
	
	


package oopWithNNLayeredApp.business;



import java.util.List;

import oopWithNNLayeredApp.core.logging.Logger;
import oopWithNNLayeredApp.dataAccess.CategoryDao;
import oopWithNNLayeredApp.dataAccess.CourseDao;
import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers=loggers;
	}
	public void add(Course course) throws Exception {
		if(isValid(course)) {
			courseDao.add(course);
		} 
		else { throw new Exception("Hata");
		
		}
			
		}
	public boolean isValid(Course course) {
		
		List<Course> courses=courseDao.getAll();
		for (Course course1 : courses) {
			if(course1.getName().equals(course.getName()) ) {
				return false;
			}
			
			
		}
		if( course.getPrice()<=0) {
			return false;
		}
		
		
		return true;
		
	}
	public void update(Course course,int id) throws Exception {
		if(isValid(course)) {
			courseDao.update(course, id);
		}
		else {
			throw new Exception("Hata");
		}
	}
	}
	
	


package oopWithNNLayeredApp;

import oopWithNNLayeredApp.business.CategoryManager;
import oopWithNNLayeredApp.business.CourseManager;
import oopWithNNLayeredApp.business.InstructorManager;
import oopWithNNLayeredApp.core.logging.DatabaseLogger;
import oopWithNNLayeredApp.core.logging.FileLogger;
import oopWithNNLayeredApp.core.logging.Logger;
import oopWithNNLayeredApp.core.logging.MailLogger;
import oopWithNNLayeredApp.dataAccess.HibernateCategoryDao;
import oopWithNNLayeredApp.dataAccess.HibernateInstructorDao;
import oopWithNNLayeredApp.dataAccess.JdbcCourseDao;
import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Course;
import oopWithNNLayeredApp.entity.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers);
		Category category=new Category(1,"Java");
		Instructor instructor=new Instructor("Engin",1);
		Course course=new Course("Java Course",1,5000,instructor,category);
		Course course1=new Course("Advanced Java Course",2,5000,instructor,category);
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),loggers);
		categoryManager.add(category);
		courseManager.add(course);
		instructorManager.add(instructor);
		courseManager.add(course1);
		
		
		
		
	}

}

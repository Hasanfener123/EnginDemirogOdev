package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Course;

public interface CourseDao {
	List<Course> getAll();
	void add(Course course);
	void delete(Course course);
	void update(Course course,int id);
	
	
}

package oopWithNNLayeredApp.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopWithNNLayeredApp.Database;
import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Course;

public class HibernateCourseDao implements CourseDao {
	List<Course> courses=Database.courses;
	@Override
	public List<Course> getAll() {
		
		return courses;
	}

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println(course.getName() + " eklendi. ");
		
	}

	@Override
	public void delete(Course course) {
		courses.remove(course);
		System.out.println(course.getName() + " silindi. ");
	}

	@Override
	public void update(Course course, int id) {
		for (Course course2 : courses) {
			if(course2.getId()==id) {
				course2.setName(course.getName());
				course2.setCategory(course.getCategory());
				course2.setInstructor(course.getInstructor());
				course2.setPrice(course.getPrice());
			}
		}
		
	}

}

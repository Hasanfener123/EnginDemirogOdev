package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Instructor;

public interface InstructorDao {
	List<Instructor> getAll();
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update(Instructor instructor,int id);
	
}

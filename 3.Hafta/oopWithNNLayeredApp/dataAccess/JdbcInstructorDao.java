package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.Database;
import oopWithNNLayeredApp.entity.Category;
import oopWithNNLayeredApp.entity.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	private List<Instructor> instructors=Database.instructors;
	

	@Override
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println(instructor.getName()+ this.getClass().getSimpleName() + " ile eklendi.");
		
	}


	@Override
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.getName() + this.getClass().getSimpleName() + " ile silindi.");
		
		
	}


	@Override
	public List<Instructor> getAll() {
		
		return instructors;
	}


	@Override
	public void update(Instructor instructor,int id) {
		List<Instructor> instructors=getAll();
		for (Instructor instructor2 : instructors) {
			if(instructor2.getId() == id) {
				instructor2.setName(instructor.getName());
				System.out.println(instructor2.getName () + " "  + id +this.getClass().getSimpleName()+ " ile guncellendi.");
			}
		}
		
	}



}

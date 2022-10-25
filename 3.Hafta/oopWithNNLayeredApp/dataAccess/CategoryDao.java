package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.entity.Category;

public interface CategoryDao {
	List<Category> getAll();
	void add(Category category);
	void delete(Category category);
	void update(Category category,int id);
	
}

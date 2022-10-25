package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.Database;
import oopWithNNLayeredApp.entity.Category;

public class JdbcCategoryDao implements CategoryDao {
	private List<Category> categories=Database.categories;

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" bu ürün JDBC ile eklendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName() + " bu ürün JDBC ile silindi.");
		
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public void update(Category category,int id) {
		
		
	}

}

package oopWithNNLayeredApp.dataAccess;

import java.util.List;

import oopWithNNLayeredApp.Database;
import oopWithNNLayeredApp.entity.Category;

public class HibernateCategoryDao implements CategoryDao {
	private List<Category> categories=Database.categories;
	

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println(category.getName()+" bu ürün Hibernate ile eklendi.");
		
	}


	@Override
	public void delete(Category category) {
		
		System.out.println(category.getName() + " bu ürün Hibernate ile silindi.");
		
		
	}


	@Override
	public List<Category> getAll() {
		
		return categories;
	}


	@Override
	public void update(Category category,int id) {
		List<Category> categories=getAll();
		for (Category category2 : categories) {
			if(category2.getId() == id) {
				category2.setName(category.getName());
				System.out.println(category.getName () + " "  + id + " guncellendi. ");
			}
		}
		
	}

}

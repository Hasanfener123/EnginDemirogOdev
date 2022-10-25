package oopWithNNLayeredApp.business;



import java.util.List;

import oopWithNNLayeredApp.core.logging.Logger;
import oopWithNNLayeredApp.dataAccess.CategoryDao;
import oopWithNNLayeredApp.entity.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	public void add(Category category) throws Exception {
		if(isValid(category)) {
			categoryDao.add(category);
		} 
		else { throw new Exception("Hata");
		
		}
			
		}
	public boolean isValid(Category category) {
		
		List<Category> categories=categoryDao.getAll();
		for (Category category2 : categories) {
			if(category2.getName().equals(category.getName())) {
				return false;
			}
		
		}
		
		
		return true;
		
	}
	public void update(Category category,int id) throws Exception {
		if(isValid(category)) {
			categoryDao.update(category, id);
		}
		else {
			throw new Exception("Hata");
		}
	}
	}
	
	


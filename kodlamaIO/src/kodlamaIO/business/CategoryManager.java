package kodlamaIO.business;


import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers,List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category categor : categories) {
			if(categor.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Girdiğiniz Kategori adında bir kategori mevcut. Lütfen farklı bir kategori giriniz");
			}
		}
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}

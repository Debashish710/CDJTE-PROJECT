package com.niit.EcommerceBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOimpl implements CategoryDAO {

	
	private static List<Category> categories =new ArrayList<>();
	
	static
	{
	Category cat=new Category();
	cat.setId(1);
	cat.setName("India");
	cat.setDescription("This is incredable");
	cat.setImageURL("1.jpg");
	categories.add(cat);
	
	cat=new Category();
	cat.setId(2);
	cat.setName("Japan");
	cat.setDescription("Land of rising Sun");
	cat.setImageURL("2.jpg");
	categories.add(cat);
	
	cat=new Category();
	cat.setId(3);
	cat.setName("Russia");
	cat.setDescription("Most powerful nation");
	cat.setImageURL("3.jpg");
	categories.add(cat);
	}
	
	
	@Override
	public List<Category> lists() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}

}

package service;

import java.util.Set;

import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Product;

public class ProductServiceImpl implements ProductService{
		 ProductDao dao=(ProductDao) new ProductDaoImpl();
			@Override
			public String addProduct(Product product) {
				
				return dao.addProduct(product);
			}

			@Override
			public String updateProduct(Product product) {
				
				return dao.updateProduct(product);
			}

			@Override
			public String deleteProduct(int productId) {
				
				return dao.deleteProduct( productId);
			}

			@Override
			public String getProductById(int productId) {
				
				return dao.getProductById(productId);
			}

			@Override
			public Set<String> getAllProducts() {
				
				return dao.getAllProducts();
			}

			@Override
			public Set<String> getAllProductsByPricerange(int initialPrice, int finalPrice) {
				
				return dao.getAllProductsByPricerange(initialPrice,finalPrice) 
					 ;
			}

			@Override
			public Set<String> getAllProductsByCategory(String category) {
				
				return dao.getAllProductsByCategory(category);
			}

			@Override
			public Set<String> getAllProductsByBrandName(String brandName) {
				
				return dao.getAllProductsByBrandName(brandName);
			}

			@Override
			public Set<String> getAllProductsByPriceRange(int lowerPrice, int upperPrice) {
				// TODO Auto-generated method stub
				return dao.getAllProductsByPricerange(lowerPrice, upperPrice);
			}
			public String getAllDetails(int productid) {
				return dao.getAllDetailsById(productid);
			}

			
			

}

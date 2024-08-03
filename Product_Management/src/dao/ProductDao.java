package dao;
import java.util.Set;

import model.Product;
//import productmanagement.model.Product;
//import productmanagement.service.String;
public interface ProductDao {
		public abstract String addProduct(Product product);
		
		public abstract String updateProduct(Product product);
		
		public abstract String deleteProduct(int productId);
		
		public abstract String getProductById(int productId);
		
		public abstract Set<String>getAllProducts();
		
		public abstract Set<String>getAllProductsByPricerange(int initialPrice, int finalPrice);
		
		public abstract Set<String>getAllProductsByCategory(String category);
		
		public abstract Set<String>getAllProductsByBrandName(String brandName);
		
		public abstract String getAllDetailsById(int productid);

	}


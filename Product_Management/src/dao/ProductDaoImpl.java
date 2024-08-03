package dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.Product;


public class ProductDaoImpl implements ProductDao{

	HashMap<Integer,Product>products = new HashMap<Integer,Product>();
	
	@Override
	public String addProduct(Product product) {
		products.put(Product.getProductByid(),product);
		return "product saved successfully with id:"+ Product.getProductByid();
	}

	@Override
	public String updateProduct(Product product) {
		products.put(Product.getProductByid(),product);
		return "product updated sucessfully";
	}

	@Override
	public String deleteProduct(int productId) {
		products.remove(productId);
		return "product deleted sucessfully";
	}

	@Override
	public String getProductById(int productId) {
		 Product product = products.get(productId);  
	        if (product != null) {
	            return product.getProductName();
	        } else {
	            return "Product not found";
	        }
	}

	@Override
	public Set<String> getAllProducts() {
		Set<Integer>keys=products.keySet();
		HashSet<String> values= new HashSet<String>();
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			Product product = products.get(key);
			values.add(product.getProductName());
		}
		return values;
	}

	@Override
	public Set<String> getAllProductsByPricerange(int initialPrice, int finalPrice) {
		Set<String> values = new HashSet<String>();

        for (Product product : products.values()) {
            int actualPrice = product.getProductPrice();
            if (actualPrice >= initialPrice && actualPrice <= finalPrice) {  // Using inclusive range
                values.add(product.getProductName());
            }
        }
        return values;
	}

	@Override
	public Set<String> getAllProductsByCategory(String category) {
		Set<String> values = new HashSet<String>();

        for (Product product : products.values()) {
            if (product.getProductCategory().equalsIgnoreCase(category)) {
                values.add(product.getProductName());
            }
        }
        return values;
	}

	@Override
	public Set<String> getAllProductsByBrandName(String brandName) {
		Set<String> values = new HashSet<String>();

        for (Product product : products.values()) {
            if (product.getProductBrand().equalsIgnoreCase(brandName)) {
                values.add(product.getProductName());
            }
        }
        return values;
	}
		
	public String getAllDetailsById(int productid) {
		Product product=products.get(productid);
		if(product!=null) {
			return product.getAllDetailsOfProduct();
		}
		else {
			return "Product not Found";
		}
	}

}

			

	  
	  
	  
	  
		

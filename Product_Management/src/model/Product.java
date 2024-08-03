package model;

public class Product {

	static int productid;
	static int productprice;
	static int productquantity;
	static String productcategory,productbrand,productname;
	
	public Product(int productid, String productname, int productprice, String productcategory, String productbrand,
			int productquantity) {
		this.productid=productid;
		this.productname=productname;
		this.productprice=productprice;
		this.productcategory=productcategory;
		this.productbrand=productbrand;
		this.productquantity=productquantity;
	}

	public static String getProductName() {
		return productname;
	}
	public static int getProductByid() {
		// TODO Auto-generated method stub
		return productid;
	}

	public static int getProductPrice() {
		// TODO Auto-generated method stub
		return productprice;
	}

	public static String getProductCategory() {
		// TODO Auto-generated method stub
		return productcategory;
	}

	public static String getProductBrand() {
		// TODO Auto-generated method stub
		return productbrand;
	}

	public String getAllDetailsOfProduct() {
		// TODO Auto-generated method stub
		return "	Productid: "+productid+"\n	ProductName: "+productname+"\n	ProductPrice: "+productprice+"\n	ProductCategory: " +productcategory+"\n	ProductBrand: "+productbrand+"\n	ProductQuantity: "+productquantity;
	}



}

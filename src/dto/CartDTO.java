package dto;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class CartDTO {

	
	private List<Product> productList = new ArrayList<Product>(); 
	

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	
	
	
	
	
	
	//Notas:
	/*Porque não se usou constructores?
	 * 
	  Aqui vou ter uma lista de produtos dentro do carrinho*/
	
}

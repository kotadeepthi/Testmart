package com.demo.soad.ws.server.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

	List<String> booksList =  new ArrayList<String>();
	List<String> moviesList =  new ArrayList<String>();
	List<String> musicList =  new ArrayList<String>();
	
	public ProductServiceImpl(){
		booksList.add("Inferno");
		booksList.add("Joy Land");
		booksList.add("The Game Of Thrones from git");
		
		moviesList.add("Movie 1");
		moviesList.add("Movie 2");
		moviesList.add("Movie 3");
		
		musicList.add("Music 1");
		musicList.add("Music 2");
		musicList.add("Music 3");
		
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category){
		case  "books" :
			return booksList;
		case "music" :
			return musicList;
		case "movies" :
			return moviesList;
		}
		return null;
	}

	public boolean addProduct(String category,String productName){
		switch (category){
		case  "books" :
			 booksList.add(productName);
			 break;
		case "music" :
			 musicList.add(productName);
			 break;
		case "movies" :
			moviesList.add(productName);
			break;
			default:return false;
		}
		return true;
		
	}
	
	public List<Product> getProductsV2(String category) throws InvalidInputException{
		List<Product> booksList =  new ArrayList<Product>();
		switch (category){
		case  "books" :
			 booksList.add(new Product("Book1",1,"SKU1"));
			 booksList.add(new Product("Book2",2,"SKU2"));
			 booksList.add(new Product("Book3",3,"SKU3"));
			 break;
		case "music" :
			booksList.add(new Product("Music1",1,"SKU1"));
			 booksList.add(new Product("Music2",2,"SKU2"));
			 booksList.add(new Product("Music3",3,"SKU3"));
			 break;
		case "movies" :
			booksList.add(new Product("Movies1",1,"SKU1"));
			 booksList.add(new Product("Movies2",2,"SKU2"));
			 booksList.add(new Product("Movies3",3,"SKU3"));			
			 break;
			default:throw new InvalidInputException("Invalid Input",category+" is not a valid input");
		}
		return booksList;
		
	}
		
}

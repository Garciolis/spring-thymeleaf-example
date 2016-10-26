package es.angelfrancisco.spring_thymeleaf_example.example;

public class Product 
{
	private int id;
	private String name;
	private String description;
	
    public Product (int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
    public Product (int id, String name, String description) {
    	this.id = id;
    	this.name = name;
    	this.description = description;
    }
    
    public int getId () {
    	return this.id;
    }
    
    public String getName () {
    	return this.name;
    }
    
    public String getDescription () {
    	return this.description;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public void setDescription (String description) {
    	this.description = description;
    }
}

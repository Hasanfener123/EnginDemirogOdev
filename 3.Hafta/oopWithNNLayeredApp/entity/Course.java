package oopWithNNLayeredApp.entity;

public class Course {
	private String name;
	private int id;
	private double price;
	private  Instructor instructor;
	private Category category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Course(String name, int id, double price, Instructor instructor, Category category) {
		
		this.name = name;
		this.id = id;
		this.price = price;
		this.instructor = instructor;
		this.category = category;
	}
	public Course() {
		
	}
	
	
}

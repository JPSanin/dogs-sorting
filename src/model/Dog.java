package model;

import java.time.LocalDate;
import processing.core.PApplet;

public class Dog implements Comparable<Dog>{

	private int id;
	private String name;
	private int age;
	private String breed;
	private LocalDate birthDate;
	private PApplet app;
	public Dog(int id, String name, int age, String breed, String dateString, PApplet app) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		birthDate = LocalDate.parse(dateString);
		this.app = app;
	}
	
	
	public void draw(int posX) {
		String info="ID:"+id+"\n "+"Name: "+name+"\n"+"Age: "+age+"\n"+"Breed: "+breed+"\n"+"Birth Date: "+birthDate;
		app.text(info,posX, 300);
	}
	
	
	public String exportString(char c) {
		String info="";
		return info;
	}
	
	@Override
	public int compareTo(Dog d1) {
		return id-d1.getId();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	}



	
	
	
	
	
}

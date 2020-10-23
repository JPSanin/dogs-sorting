package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class DogList {

	
	private ArrayList<Dog> dogList;
	private PApplet app;
	private NameComparator nc;
	private AgeComparator ac;
	private BreedComparator bc;
	private DateComparator dc;
	
	
	
	public DogList(PApplet app) {
		dogList= new ArrayList<Dog>();
		this.app = app;
	}
	
	public void addDogs(String[] info1, String[] info2) {
		addSingleDog(0, "pp",0, "00", "");
	}
	
	private void addSingleDog(int id, String name, int age, String breed, String dateString) {
		
	}
	
	public void sort(char c) {
		
	}

	
	
	

	public ArrayList<Dog> getDogList() {
		return dogList;
	}
	
	
}

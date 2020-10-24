package model;

import java.util.ArrayList;
import java.util.Arrays;

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
		
		
		for (int i = 0; i < info1.length; i++) {
			String[] atributes1=info1[i].split(",");
			int id=Integer.parseInt(atributes1[0].trim());
			String name= atributes1[1].trim();
			int age=Integer.parseInt(atributes1[2].trim());
			for (int j = 0; j < info2.length; j++) {
				String[] atributes2=info2[j].split(",");
				int id2=Integer.parseInt(atributes2[0].trim());
				String breed= atributes2[1].trim();
				String date=atributes2[2].trim();
				if(id==id2) {
					addSingleDog(id,name,age,breed,date);
				}
			}
		}
		
	}
	
	private void addSingleDog(int id, String name, int age, String breed, String dateString) {
		Dog newDog= new Dog(id,name,age,breed,dateString,app);
		dogList.add(newDog);
	}
	
	public void sort(char c) {
		
	}

	
	
	

	public ArrayList<Dog> getDogList() {
		return dogList;
	}
	
	
}

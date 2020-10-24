package controller;

import model.DogList;
import processing.core.PApplet;

public class Controller {

	private DogList dogList;
	
	
	public Controller(PApplet app) {
		dogList=new DogList(app);
	}
	
	public void addItems(String[] info1,String[] info2) {
		dogList.addDogs(info1, info2);
	}
	
	public void sort(char c) {
		dogList.sort(c);
	}

	public DogList getDogList() {
		return dogList;
	}

	
}

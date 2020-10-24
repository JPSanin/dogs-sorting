package model;

import java.util.ArrayList;
import java.util.Collections;

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
		nc= new NameComparator();
		ac= new AgeComparator();
		bc= new BreedComparator();
		dc=new DateComparator();
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
		String[] export= new String [dogList.size()+1];
		export[0]= "ID | Name | Age | Breed | Birth Date ";
		String exportname="";
		switch(c) {
		
		case 'i':
			Collections.sort(dogList);
			exportname="Id Export";
			for (int i = 0; i < dogList.size(); i++) {
				export[i+1]= dogList.get(i).exportString();
			}
			break;
		case 'a':
			Collections.sort(dogList,ac);
			exportname="Age Export";
			for (int i = 0; i < dogList.size(); i++) {
				export[i+1]= dogList.get(i).exportString();
			}
			break;
		case 'd':
			Collections.sort(dogList,dc);
			exportname="Birth Date Export";
			for (int i = 0; i < dogList.size(); i++) {
				export[i+1]= dogList.get(i).exportString();
			}
			break;
		case 'n':
			Collections.sort(dogList,nc);
			exportname="Name Export";
			for (int i = 0; i < dogList.size(); i++) {
				export[i+1]= dogList.get(i).exportString();
			}
			break;
			
		case 'b':
			Collections.sort(dogList,bc);
			
			exportname="Breed Export";
			for (int i = 0; i < dogList.size(); i++) {
				export[i+1]= dogList.get(i).exportString();
			}
			break;
			
		}
		app.saveStrings("data/"+exportname+".txt", export);
		
		
	}

	
	
	

	public ArrayList<Dog> getDogList() {
		return dogList;
	}
	
	
}

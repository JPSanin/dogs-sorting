package view;

import controller.Controller;
import processing.core.PApplet;


public class Main extends PApplet{

	private Controller controller;
	private String[] input1;
	private String[] input2;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(1300,400);
	
	}
	public void setup() {
		controller= new Controller(this);
		input1= loadStrings("data/info1.txt");
		input2= loadStrings("data/info2.txt");
		controller.addItems(input1, input2);
	}
	

	
	public void draw() {
		background(0);
		for (int i = 0; i < controller.getDogList().getDogList().size(); i++) {
			controller.getDogList().getDogList().get(i).draw(25+(i*130));
		}
	}
	
	public void keyPressed() {
		controller.sort(key);
	}

}

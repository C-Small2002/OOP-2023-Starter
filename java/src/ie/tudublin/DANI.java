package ie.tudublin;

import java.io.File;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
       
	}

	public void keyPressed() {

	}
	

	public void loadFile(){

		String[] lines = loadStrings("shakespere.txt");
		for(int i = 0; i < lines.length; i++){
			String line = lines[i];
			split(line, ' ');
			line = lines[i].replace("[^\\w\\s]","");
			line = lines[i].toLowerCase();
			
		}	

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}

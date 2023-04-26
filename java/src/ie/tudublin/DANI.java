package ie.tudublin;

import java.io.File;
import java.util.ArrayList;

import ie.Word;
import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	String[] words;
	Word word;
	
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

		String[] lines = loadStrings("small.txt");
		
		for(String line : lines){
			words = split(line, ' ');
			for(String w : words){
				w = w.replace("[^\\w\\s]","");
				w = w.toLowerCase();
				if(findWord(w) == true){
				Word word = new Word(w);
				word.setFollows(null);
				}
				
			}
		}


		//look up splitting file into individual words in java processing

	}

	public Boolean findWord(String str){
		for(String w : words){
			if(str == w){
				return false;
			}
		}
		return true;
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

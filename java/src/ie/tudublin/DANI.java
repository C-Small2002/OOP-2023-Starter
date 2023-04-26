package ie.tudublin;

import java.io.File;
import java.util.ArrayList;

import ie.Follow;
import ie.Word;
import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> wordz = new ArrayList<Word>();

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	String[] words;
	Word word;
	Follow follow;
	
    public String[] writeSonnet()
    {
		for(int i = 0; i < 14; i++){
			for(Word word : wordz){
				System.out.println(word);	
			}
		}

        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();
		writeSonnet();
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
					word.findFollow(w);
					wordz.add(word);
					System.out.println(word);
				}
				
			}
		}
		/*
		for(String line : lines){
			words = split(line, ' ');
			for(int i = 0; i<=words.length-1; i++){
				String w;
				w = words[i].replace("[^\\w\\s]","");
				w = words[i].toLowerCase();
				if(findWord(w) == true){
					Word word = new Word(w);
					word.findFollow(w);
					wordz.add(word);
					System.out.println(word);
				}
				
			}
		}
		*/

		//look up splitting file into individual words in java processing

	}

	public void printModel(){
		for(Word w : wordz){
			System.out.println(w);
		}
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
		//printModel();
		//writeSonnet();
        
	}
}

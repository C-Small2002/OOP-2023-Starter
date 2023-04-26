package ie;

import java.util.ArrayList;

import processing.data.TableRow;

public class Word {
    String word;
    Follow follow;
    ArrayList<Follow> follows = new ArrayList<Follow>();

    public Word(String word){
        this.word = word;
    }


    public void addFollow(Follow follow){
        follows.add(follow);
    }

    public void findFollow(String str){
        for(Follow f : follows){
            if(f.getWord() == str){
                f.count++;
            }
            else{
                f.setWord(str);
                f.count = 0;
            }
        }
    }

    @Override
    public String toString() {
        return word +": " + getFollows();
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public ArrayList<Follow> getFollows() {
        return follows;
    }

    
}

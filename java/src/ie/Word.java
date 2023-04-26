package ie;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return word;
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
    public void setFollows(Follow follows) {
        this.follow
    }
    
}

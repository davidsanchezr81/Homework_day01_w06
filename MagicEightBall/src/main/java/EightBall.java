

//The EightBall class should take in an ArrayList of answers (maybe 3 to start with).
//The EightBall class should have a method to return a random answer from the list. (Look into the Collections class for a helpful method here).


import com.sun.javaws.ExtensionInstallHandler;

import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int getAnswerCount(){
        return this.answers.size();
    }

    public String getAnswerAtIndex(int index){
        return this.answers.get(index);
    }

    public ArrayList<String> getAnswers() {
        ArrayList<String> copyanswers = new ArrayList<>(this.answers);
        return copyanswers;
    }

    public String getRandomAnswer() {
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

    ////// ADDING AN ANSWER

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String yes) {
        this.answers.remove("yes");
    }
}

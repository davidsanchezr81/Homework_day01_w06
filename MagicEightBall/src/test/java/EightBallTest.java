import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall myAnswers;


        @Before
        public void before(){
            ArrayList<String> testAnswers = new ArrayList<>();
            testAnswers.add("yes");
            testAnswers.add("no");
            testAnswers.add("probably");
            this.myAnswers = new EightBall(testAnswers);

        }


        @Test
        public void hasNumberOfEntries(){
        assertEquals(3, myAnswers.getAnswerCount());
    }


        @Test
        public void canGetRandom(){
            ArrayList<String> random = myAnswers.getAnswers();
            String randomAnswer = myAnswers.getRandomAnswer();
            assertTrue(random.contains(randomAnswer));
    }

    ////// ADDING AN ANSWER

        @Test
        public void canAddAnswer(){
        myAnswers.addAnswer("none");
        assertEquals(4, myAnswers.getAnswerCount());
    }


    ////// REMOVING AN ANSWER

        @Test
        public void canRemoveAnswer(){
        myAnswers.removeAnswer("yes");
        assertEquals(2, myAnswers.getAnswerCount() );
        }

}




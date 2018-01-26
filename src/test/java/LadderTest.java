import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class LadderTest {
    private static final Logger logger = LoggerFactory.getLogger(LadderTest.class);
    ArrayList<Boolean> points = new ArrayList<Boolean>(Arrays.asList(true, true, false, true));
    Ladder ladder;
    LadderInput input;
    Line line;

    @Before
    public void setUp() {
        Line line = new Line();
        ladder = new Ladder();
        LadderInput input = new LadderInput();
    }

    @Test
    public void addLadder() {
        Boolean add = ladder.returnAdd(6);
        assertEquals(true, add);
    }

    @Test
    public void notAddLadder() {
        Boolean notAdd = ladder.returnAdd(4);
        assertEquals(false, notAdd);
    }

    @Test
    public void printLineSize(){
        int size = points.size();
        assertEquals(4, size);
    }

    @Test
    public void drawLine(){
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }
    }

    @Test
    public void resultTest(){
        assertEquals(true, points.get(0).booleanValue());
    }

    @Test
    public void printBar(){
        System.out.println(line.result(0));
    }


//    public String result(int i){
//        checkNext();
//        if (points.get(i).booleanValue() == true && i != points.size() -1)
//            return "-----";
//        return "     ";
//    }
//
//    public String printTrueFalse(int i){
//        checkNext();
//        if (points.get(i).booleanValue() == true)
//            return "true";
//        return "false";
//    }

}

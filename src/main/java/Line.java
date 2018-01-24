import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Line {
    private static final Logger logger = LoggerFactory.getLogger(Line.class);
    private ArrayList<Boolean> points = new ArrayList<Boolean>();

    public void addTrueFalse(Boolean bool) {
        points.add(bool);
    }

    public void checkNext() {
        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i).booleanValue() == true) {
                points.set(i + 1, false);
            }
        }
    }

    public String result2(int i){
        checkNext();
        if (points.get(i).booleanValue() == true)
            return "-----";
        return "     ";
    }

    public String printTrueFalse(int i){
        checkNext();
        if (points.get(i).booleanValue() == true)
            return "true";
        return "false";
    }

    public void afterChange(){
        checkNext();
        for (int i = 0; i < points.size(); i++){
            logger.info("after value of points {} is {}", i, points.get(i).booleanValue());
        }
    }
}
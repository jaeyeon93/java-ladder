import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Line {
    private static final Logger logger = LoggerFactory.getLogger(Line.class);
    private ArrayList<Boolean> points = new ArrayList<>();


    public void addTrueFalse(Boolean returnAdd) {
        points.add(returnAdd);
    }

    public void printSize(){
        logger.info("size of points is {}", points.size());
    }

    public void checkNext() {
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).booleanValue() == true) {
                points.set(i + 1, false);
            }
        }
    }
}
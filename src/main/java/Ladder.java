import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();
    ArrayList<Line> lines = new ArrayList<Line>();

    public String peoplePrint(int people){
        String result = "";
        for(int i = 0; i < (2 * people) - 1; i++){
            result = checkOdd(i, result);
        }
        return result;
    }

    public String checkOdd(int i, String result){
        logger.debug("i, result : {}, {}", i, result);
        logger.debug("lines : {}", lines.size());
        if (i % 2 == 0)
            return result + "|";
        return result + lines.get(i).changeBoolean();
        //return result + returnAdd(i);
    }

    public Boolean returnAdd(int i){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10);
        if (randomNumber >= 6)
            return true;
        return false;
    }

    public void process(int people, int height){
        for (int i = 0; i < height; i++) {
            lines.add(new Line(people));
        }
        peoplePrint(people);
    }

    public void heightPrint(){
        for (String result:results) {
            System.out.println(result);
        }
    }
}

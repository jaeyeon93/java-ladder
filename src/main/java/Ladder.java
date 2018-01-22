import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();

    public String peoplePrint(int people){
        String result = "";
        for(int i = 0; i < people; i++){
            result = checkOdd(i, result);
        }
        return result;
    }

    public String checkOdd(int i, String result){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10);
        if (i % 2 == 0) {
            return result + "|";
        }
        return result + add(randomNumber);
    }

    public String add(int randomNumber){
        if (randomNumber >= 6)
            return "-";
        return " ";

    }

    public void process(int people, int height){
        for (int i = 0; i < height; i++) {
            results.add(peoplePrint(people));
        }
        logger.info("people is {}", people);
        logger.info("height is {}", height);

    }

    public void heightPrint(){
        for (String result:results) {
            System.out.println(result);
        }
    }
}

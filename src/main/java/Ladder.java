import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();

    public String peoplePrint(int people){
        Random rnd = new Random();
        String result = "";
        for(int i = 0; i < people; i++){
            int randomNumber = rnd.nextInt(10);
            result = printBar(result);
            result += add(randomNumber);
        }
        return result;
    }

    public String printBar(String result){
        return result + "|";
    }

    public String add(int randomNumber){
        if (randomNumber >= 6)
            return "-----";
        return "     ";

    }

    public void process(int people, int height){
        for (int i = 0; i < height; i++) {
            results.add(peoplePrint(people));
        }
    }

    public void heightPrint(){
        for (String result:results) {
            System.out.println(result);
        }
    }
}

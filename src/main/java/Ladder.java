import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();
    ArrayList<String> result2 = new ArrayList<String>();
    ArrayList<Line> lines = new ArrayList<Line>();
    int currentIndex = 0;

    public String peoplePrint(int people){
        logger.debug("lines : {}", lines.size());
        Random rnd = new Random();
        String result = "";
        for(int i = 0; i < people; i++){
            int randomNumber = rnd.nextInt(10);
            result = printBar(result);
            result += returnAdd(randomNumber);
            lines.get(currentIndex).addTrueFalse(returnAdd(randomNumber));
        }
        return result;
    }

    public String method2(int people) {
        String emp = "     ";
        for (int i = 0; i < people; i++){
            emp = printBar(emp);
            if (i == people - 1){
                return emp;
            }
            emp += lines.get(currentIndex).result2(i);
        }
        return emp;
    }

    public String printBar(String result){
        return result + "|";
    }

    public boolean returnAdd(int randomNumber) {
        if (randomNumber >= 4)
            return true;
        return false;
    }

    public void process(int people, int height){
        // 초기화부분
        for (int i = 0; i < height; i++) {
            lines.add(new Line());
            results.add(peoplePrint(people));
            result2.add(method2(people));
            currentIndex++;
        }
    }

    public void heightPrint(){
        for (String result:result2) {
            System.out.println(result);
        }
    }
}

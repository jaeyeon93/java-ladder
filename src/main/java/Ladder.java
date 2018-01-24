import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();
    ArrayList<String> emps = new ArrayList<String>();
    ArrayList<Line> lines = new ArrayList<Line>();
    int currentIndex = 0;


    public String peoplePrint(int people){
        logger.debug("lines : {}", lines.size());
        Random rnd = new Random();
        String result = "";
        for(int i = 0; i < people; i++){
            int randomNumber = rnd.nextInt(10);
            //result = printBar(result);
            result += returnAdd(randomNumber);
            lines.get(currentIndex).addTrueFalse(returnAdd(randomNumber));
        }
        return result;
    }


// Before
//    public String finalResult(int people) {
//        String emp = "     ";
//        for (int i = 0; i < people; i++){
//            //emp = printBar(emp);
//            if (i == people - 1){
//                return emp;
//            }
//            emp += lines.get(currentIndex).result2(i);
//        }
//        return emp;
//    }


    public String finalResult(int people) {
        String emp = "     ";
        for (int i = 0; i < people; i++){
            //emp = printBar(emp);
            if (i == people - 1){
                return emp;
            }
            emp += lines.get(currentIndex).printTrueFalse(i);
        }
        return emp;
    }

    public String printBar(String result){
        return result + "|";
    }

    public void printBar2(){
        System.out.print("|");
    }

    public boolean returnAdd(int randomNumber) {
        if (randomNumber >= 4)
            return true;
        return false;
    }

    public void resetPart(int people, int height){
        for (int i = 0; i < height; i++) {
            lines.add(new Line());
            results.add(peoplePrint(people));
//            emps.add(finalResult(people));
            currentIndex++;
        }
    }

    public static void printNames(List<String> names){
        for (String name : names) {
            System.out.print(String.format("%5s", name));
        }
    }

    public void printTF(int people, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < people; j++){
                printBar2();
                System.out.print(lines.get(i).printTrueFalse(j));
            }
            System.out.println();
        }
    }


    public void printLayer(){
        for (String result: emps) {
            System.out.println(result);
        }
    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<Line> lines = new ArrayList<Line>();
    int currentIndex = 0;

    public void createLines(int people){
        Random rnd = new Random();
        for(int i = 0; i < people; i++){
            int randomNumber = rnd.nextInt(10);
            lines.get(currentIndex).addTrueFalse(returnAdd(randomNumber));
        }
    }

    public void printBar(){
        System.out.print("|");
    }

    public boolean returnAdd(int randomNumber) {
        if (randomNumber >= 6)
            return true;
        return false;
    }

    public void resetPart(int people, int height){
        for (int i = 0; i < height; i++) {
            lines.add(new Line());
            createLines(people);
            currentIndex++;
        }
    }

    public static void printNames(List<String> names){
        for (String name : names) {
            System.out.print(String.format("%5s", name));
        }
    }

    public void printHeight(int people, int height){
        for (int j = 0; j < height; j++) {
            printPeople(people, j);
            System.out.println();
        }
    }

    public void check(int people, int i, int height){
        System.out.print(lines.get(height).result(i, people));
    }

    public void printPeople(int people, int height){
        for (int i = 0; i < people; i++){
            printBar();
            check(people, i, height);
        }
    }
}


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Ladder {
    private static final Logger logger = LoggerFactory.getLogger(Ladder.class);
    ArrayList<String> results = new ArrayList<String>();

    public int peopleInput(String peopleInput){
        return Integer.parseInt(peopleInput);
    }

    public int ladderInput(String ladderInput){
        return Integer.parseInt(ladderInput);
    }

    public String peoplePrint(int people){
        String result = "";
        for(int i = 0; i < (2 * people) - 1; i++){
            result = checkOdd(i, result);
        }
        return result;
    }

    public String add(){
        Random rnd = new Random();
        if (rnd.nextInt(10) >= 6){
            return "ㅡ";
        } else {
            return " ";
        }
    }

    public String checkOdd(int i, String result){
        if (i % 2 == 0) {
            result += "ㅣ";
        } else {
            result += add();
        }
        return result;
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

    public static void main(String [] args){
        //input영역
        Scanner scanner = new Scanner(System.in);
        Ladder ladder = new Ladder();
        logger.info("참여할 사람은 몇 명 인가요?");
        String peopleInput = scanner.nextLine();
        logger.info("최대 사다리 높이는 몇 개인가요?");
        String ladderInput = scanner.nextLine();
        int people = ladder.peopleInput(peopleInput);
        int ladderHeight = ladder.ladderInput(ladderInput);
        //output영역
        ladder.process(people, ladderHeight);
        ladder.heightPrint();
    }
}

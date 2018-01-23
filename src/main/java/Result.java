import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Result {
    public static void main(String [] args){
        Ladder ladder = new Ladder();
        LadderInput input = new LadderInput();
        input.people();
        String peopleInput = input.scannerInput();
        input.height();
        String ladderInput = input.scannerInput();

        List<String> names = input.peopleInput(peopleInput);
        int ladderHeight = input.ladderInput(ladderInput);

        ladder.process(names.size(), ladderHeight);
        for (String name : names) {
            System.out.print(String.format("%5s", name));
        }
        System.out.println();
        ladder.heightPrint();
    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Result {
    public static void main(String [] args){
        Ladder ladder = new Ladder();
        LadderInput input = new LadderInput();

        input.people();
        String peopleInput = input.scannerInput();
        input.height();
        String ladderInput = input.scannerInput();

        int people = input.peopleInput(peopleInput);
        int ladderHeight = input.ladderInput(ladderInput);

        ladder.process(people, ladderHeight);
        ladder.heightPrint();
    }
}

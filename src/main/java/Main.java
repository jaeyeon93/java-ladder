import java.util.List;

public class Main {
    public static void main(String [] args){
        Ladder ladder = new Ladder();
        LadderInput.people();
        String peopleInput = LadderInput.scannerInput();
        LadderInput.height();
        String ladderInput = LadderInput.scannerInput();
        List<String> names = LadderInput.peopleInput(peopleInput);
        int ladderHeight = LadderInput.ladderInput(ladderInput);

        ladder.resetPart(names.size(), ladderHeight);
        ladder.printNames(names);
        System.out.println();
        ladder.printTF(names.size(), ladderHeight);
        //ladder.printLayer();
    }
}

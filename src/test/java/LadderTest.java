import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderTest {
    private static final Logger logger = LoggerFactory.getLogger(LadderTest.class);
    Ladder ladder;
    // class area
    LadderInput input;

    @Before
    public void setUp() {
        ladder = new Ladder();
        LadderInput input = new LadderInput();
    }

    @Test
    public void peopleInput() {
        int people = input.peopleInput("3");
        assertEquals(3, people);
    }

    @Test
    public void ladderInput() {
        int height = input.peopleInput("5");
        assertEquals(5, height);
    }

    @Test
    public void addLadder() {
        Boolean add = ladder.returnAdd(6);
        assertEquals(true, add);
    }

    @Test
    public void notAddLadder() {
        Boolean notAdd = ladder.returnAdd(4);
        assertEquals(false, notAdd);
    }
}

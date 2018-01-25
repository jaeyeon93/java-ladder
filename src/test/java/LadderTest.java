import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class LadderTest {
    private static final Logger logger = LoggerFactory.getLogger(LadderTest.class);
    ArrayList<Boolean> points = new ArrayList<Boolean>(Arrays.asList(true, true, true, false));
    Ladder ladder;
    Line line;
    @Before
    public void setUp() {
        ladder = new Ladder();
        LadderInput input = new LadderInput();
        Line line = new Line();
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

    @Test
    public void size() {
        int pointSize = points.size();
        assertEquals(4, pointSize);
    }

    @Test
    public void testSetValue() {
        String result = line.result(1);
        assertEquals("-----", result);
    }
}

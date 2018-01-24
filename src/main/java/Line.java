import java.util.ArrayList;

public class Line {
    private ArrayList<Boolean> points = new ArrayList<Boolean>();

    public void addTrueFalse(Boolean bool) {
        points.add(bool);
    }

    public void checkNext() {
        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i).booleanValue() == true) {
                points.set(i + 1, false);
            }
        }
    }

    public String result(int i, int people){
        checkNext();
        if (points.get(i).booleanValue() == true && i != people -1)
            return "-----";
        return "     ";
    }

    public String printTrueFalse(int i){
        checkNext();
        if (points.get(i).booleanValue() == true)
            return "true";
        return "false";
    }

}
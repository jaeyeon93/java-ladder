import java.util.ArrayList;

public class Line {
    Ladder ladder = new Ladder();
    private ArrayList<Boolean> points = new ArrayList<>();
    private int countOfPerson;

    public Line (int countOfPerson){
        this.countOfPerson = countOfPerson;
    }

    public void addTrueFalse(Boolean returnAdd) {
        points.add(returnAdd);
    }

    public void checkNext() {
        for (int i = 0; i < points.size(); i++){
            if (points.get(i).booleanValue() == true) {
                points.set(i+1 , false);
            }
        }
    }

    public String changeBoolean(){
        String change = "";
        checkNext();
        for(int i = 0; i < points.size(); i++){
            change = points.get(i).toString();
        }
        return change;
    }
}

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    public static void printLadder(ArrayList<Line> lines) {
        for (Line line : lines) {
            for(int i = 0; i < line.sizeLine(); i++){
                line.setValue(i);
                printBar();
                check(line, i);

            }
            System.out.println(line);
        }
    }

    public static void printBar(){
        System.out.print("|");
    }

    public static void printNames(List<String> names){
        for (String name : names) {
            System.out.print(String.format("%5s", name));
        }
    }

//    public void printHeight(int people, int height){
//        for (int j = 0; j < height; j++) {
//            printPeople(people, j);
//            System.out.println();
//        }
//    }

//    public static void check(int people, int i, int height){
//        System.out.print(lines.get(height).result(i, people));
//    }

    public static void check(Line line, int i){
        System.out.print(line.result(i));
    }

//    public void printPeople(int people, int height){
//        for (int i = 0; i < people; i++){
//            printBar();
//            check(people, i, height);
//        }
//    }
}

package task2;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Listtt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        input(list);
        System.out.println("You enter next data:");
        iteratorOut(list);
    }

    public static void input(List list){
        System.out.println("Enter data");
        for (int i = 0; i < 10; i++){
            list.add(inputString());
        }
    }

    public static String inputString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void iteratorOut(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

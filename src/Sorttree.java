import java.util.TreeSet;

public class Sorttree {
    public static void main(String[] args) {


        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        // asending = arohana / decending = awarohana

        System.out.println("Tree set :_"+ set);
        System.out.println("revers Tree set :-"+ set.descendingSet());
        System.out.println("Top tree set "+ set.headSet("C",true));
        System.out.println("Remove tree set "+ set.subSet("A",false,"E",true));
        System.out.println("Bottom tree set "+ set.tailSet("C",false));


    }
}

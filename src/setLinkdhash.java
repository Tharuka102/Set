
import java.util.Iterator;
import java.util.LinkedHashSet;

public class setLinkdhash {
    public static void main(String[] args) {


        LinkedHashSet<String> set = new LinkedHashSet<>();
        // hash set out
        set.add("one");
        set.add("tow");
        set.add("three");
        set.add("four");
        set.add("five");

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
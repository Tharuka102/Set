import java.util.TreeSet;

public class setTree {
    public static void main(String[] args) {


        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(123);
        ts.add(1);
        ts.add(23);
        ts.add(233);

        System.out.println(ts);

        System.out.println("Lowest value "+ts.pollFirst() );
        System.out.println("Highest value "+ ts.pollLast());
    }

}

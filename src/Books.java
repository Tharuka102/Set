import java.util.LinkedHashSet;

public class Books {
    int id , qty ;
    String name,author,publisher;
    public Books(int id, String name ,String author,String publisher,int qty ){
        this.author = author;
        this.id = id;
        this. name= name;
        this.publisher = publisher;
        this.qty = qty;

    }

}
class sethashlinked{
    public static void main(String[] args) {
        LinkedHashSet<Books> lhs = new LinkedHashSet<Books>();
        Books b1 = new Books(1234,"java1","Jemz Gozlin","sun micro system",10);
        Books b2 = new Books(1235,"java2","Jemz 45"," system",7);
        Books b3 = new Books(1236,"java3","Jemz 56","sun  system",18);
        lhs.add(b1);
        lhs.add(b2);
        lhs.add(b3);
        for (Books b : lhs){
            System.out.println(b.id+ " "+ b.name+ " "+b.author+ " "+ b.publisher+" "+b.qty);
        }




    }
}

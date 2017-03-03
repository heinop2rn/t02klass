import java.io.*;
import java.util.*;
public class mainClass {
    public static void main(String[] args) {



        Poliitik trump = new Poliitik("Trump", 45.2f, 52023942);
        Poliitik clinton = new Poliitik("Clinton", 53f, 55322305);
        Poliitik sanders = new Poliitik("Sanders", 25f, 8550405);



        System.out.println(trump);


        System.out.println("Valijate arvu ja viimase reitingu suhe " + trump.votersRating() + " protsenti \n\n");


        List<Poliitik> list = new ArrayList<Poliitik>();


        list.add(trump);
        list.add(clinton);
        list.add(sanders);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("\n Politician with the most votes is " + Poliitik.highestPoliitik(list).name);
    }
}

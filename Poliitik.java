import java.io.*;
import java.util.*;
public class Poliitik {

    String name;
    float rating;
    int voters;

    public Poliitik(String name, float rating, int voters) {
        if (rating <= 0 || voters <= 0) {
            throw new RuntimeException("Incorrect values");
        }
        this.name = name;
        this.rating = rating;
        this.voters = voters;

    }

    public float votersRating() {
        return voters / rating;
    }

    public static Poliitik highestPoliitik(List<Poliitik> list) {

        Poliitik highest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).rating > highest.rating) {
                highest = list.get(i);
            }
        }

        return highest;
    }

    @Override
    public String toString() {
        return name + " reiting on: " + rating + " protsenti , ja valijate arv on: " + voters;
    }

}

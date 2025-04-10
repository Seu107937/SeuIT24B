package ontap.buoi2;

import java.util.ArrayList;
import java.util.Collections;

public class daoCauHoi {
    static ArrayList<String> questions = new ArrayList<>();

    public static void main(String[] args) {
        String q1 = " ban dang lam gi";
        String q2 = " ban an com chua";
        String q3 = " ban muon hoc tiep khong";
        String q4 = " moi gio ve";

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        Collections.shuffle(questions);
        for (String s : questions) {
            System.out.println(s);
        }

    }

}

package Collections;

import java.util.ArrayList;

public class ArrayForEach {

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<String>();

        alist.add("a");
        alist.add("b");
        alist.add("a");

        for (String i : alist) {
            System.out.println(i);
        }
    }
}

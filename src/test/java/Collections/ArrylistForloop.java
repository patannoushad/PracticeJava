package Collections;

import java.util.ArrayList;

public class ArrylistForloop {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<Integer>();

        alist.add(3);
        alist.add(4);
        alist.add(5);
        alist.add(3);

        for (int i=0;i<alist.size();i++){

            System.err.print(alist.get(i) +"   ");
        }

    }
}

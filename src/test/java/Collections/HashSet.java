package Collections;


public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String > hset = new java.util.HashSet<String>();

        hset.add("a");
        hset.add("b");
        hset.add("a");

        for (int i=0;i<hset.size();i++){
            System.out.println(i);
        }

//        for (String i: hset  ) {
//
//            System.out.println(i);
//        }


    }
}

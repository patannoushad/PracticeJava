package Collections;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer,String > hmap = new java.util.HashMap<Integer, String>();

        hmap.put(101,"Noushad");
        hmap.put(102,"pathan");
        hmap.put(103,"vamsi");
//        for (int i=0;i<hmap.size();i++){
//            System.out.println(hmap.get(i));
//        }
        for (Integer i: hmap.keySet()  ) {

            System.out.println(hmap.get(i));
        }
    }
}

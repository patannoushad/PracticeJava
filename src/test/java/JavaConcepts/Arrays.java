package JavaConcepts;

public class Arrays {
    public static void main(String[] args){
        int [][] a = {{2,8,3,4},{3,5,6,4}};

        for (int row=0; row<a.length; row++){
            for (int col=0; col<a[0].length;col++){

                System.out.println( "print the values of  a["+row+"]["+col+"]    "+a[row][col]);
            }
        }
    }
}

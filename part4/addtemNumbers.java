import java.util.ArrayList; // import the ArrayList class

public class addtemNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        addTenNumber(a);
    }

    public static void addTenNumber(ArrayList<Integer> array){

        for (int i=0; i<10; i++){
            array.add(i);
        }
    }
    
}
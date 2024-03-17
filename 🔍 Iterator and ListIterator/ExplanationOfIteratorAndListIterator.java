import java.util.ArrayList;

public class ExplanationOfIteratorAndListIterator {
    

    public static void main(String[] args) {
        

        ArrayList ar=new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(100);

        System.out.println();

        // Here we can access these data through loops also but there are some disadvantage

        for(int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}

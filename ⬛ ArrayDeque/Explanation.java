import java.util.ArrayDeque; // Importing the ArrayDeque class from the java.util package

public class Explanation { // Declaring a public class named Explanation

    public static void main(String[] args) { // Declaring the main method

        ArrayDeque ad1 = new ArrayDeque(); // Creating a new instance of ArrayDeque named ad1
        

        
        // Adding elements to the ArrayDeque
        ad1.add(100); // Adding the integer 100 to the ArrayDeque ad1
        ad1.add(200); // Adding the integer 200 to the ArrayDeque ad1

        // Printing the contents of the ArrayDeque ad1
        System.out.println(ad1);

        // Let's Check here Duplicates are allowed or not
        System.out.println("-------------------------------------");
        ad1.add(200);
        System.out.println(ad1);
        System.out.println("-------------------------------------");

        // Let's check if it stores heterogeneous data or not.
        ad1.add("ADV");
        ad1.add(23.34);
        ad1.add('T');
        System.out.println(ad1);

        System.out.println("-------------------------------------");

        // Demonstrating the addFirst() Method
        System.out.println("Use of addFirst() Method");
        ad1.addFirst("Vinay Kumar");
        System.out.println(ad1);

        System.out.println("-------------------------------------");

        // Demonstrating the addLast() Method
        System.out.println("Use of addLast() Method");
        ad1.addLast("ADV Indian Coder");
        System.out.println(ad1);

        System.out.println("-------------------------------------");

        // Demonstrating the offer() Method
        System.out.println("Use of add.Offer() Method");
        ad1.offer(500);
        System.out.println(ad1);

        System.out.println("-------------------------------------");

        // Demonstrating the offerFirst() Method
        System.out.println("Use of add.OfferFirst() Method");
        ad1.offerFirst(100); // it is the same as addFirst but the data will be stored if it is not fixed
        System.out.println(ad1);

        System.out.println("-------------------------------------");

        // Demonstrating the offerLast() Method
        System.out.println("Use of add.OfferLast() Method");
        ad1.offerLast("Founder Vinay");
        System.out.println(ad1);
        System.out.println("-------------------------------------");

        System.out.println("Use of add.clear() Method");
        System.out.println("-------------------------------------");

        ad1.clear();
        System.out.println(ad1);
    }
}

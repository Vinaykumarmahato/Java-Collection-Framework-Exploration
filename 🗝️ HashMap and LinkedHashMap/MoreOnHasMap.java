import java.util.*;
import java.util.Map .*;


class Student {

    private String name;
    private int age;
    private String city;

    /**
     * Student()
     */
    public Student(String name, int age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {

        return name + " " +" "+ " "+ " "+age +" "+ city;
    }
}

public class MoreOnHasMap {

    public static void main(String[] args) {

        Student s1 = new Student("Vinay Kumar", 20, "Patna");
        Student s2 = new Student("Arjun Sahani", 21, "Darbhanga");
        Student s3 = new Student("Anish Kumar", 22, "Chapra");

        Map map = new HashMap();
        map.put(01, s1);
        map.put(02, s2);
        map.put(03, s3);

        System.out.println(map);

        // Both Key and Value will be print here
        Set key1=map.entrySet();

        Iterator itr1=key1.iterator();
        while (itr1.hasNext()) 
        {
         //System.out.println(itr1);  it will print

         // lets store it
            Map.Entry bothdata=(Entry)itr1.next();

            System.out.println(bothdata.getKey() +":"+ bothdata.getValue());
         
         
        }

    }
}

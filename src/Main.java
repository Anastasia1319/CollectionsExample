import java.util.*;

public class Main {
    public static void main(String[] args) {

    Person per1 = new Person("Antony", "Swit", Gender.MALE);
    Person per2 = new Person("Ann", "Villy", Gender.FEMALE);
    Person per3 = new Person("Kily", "Stiv", Gender.FEMALE);
    Person per4 = new Person("Henry", "Gob", Gender.MALE);
    Person per5 = new Person("Ann", "Villy", Gender.FEMALE);

        ArrayList<Person> people = new ArrayList<>();
        people.add(per1);
        people.add(per2);
        people.add(per3);
        people.add(per4);
        people.add(per5);

        System.out.println("In collection List " + people.size() + " elements:");
        for (Person p: people) {
            System.out.println(p);
        }
        System.out.println();


        Person per6 = new Person("Hanna", "Stiv", Gender.FEMALE);
        Person per7 = new Person("Hanna", "Stiv", Gender.FEMALE);
        Person per8 = new Person("Kitty", "Boul", Gender.FEMALE);
        Person per9 = new Person("Henry", "Gob", Gender.MALE);
        Person per10 = new Person("Henry", "Gob", Gender.MALE);

        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(per6);
        peopleSet.add(per7);
        peopleSet.add(per8);
        peopleSet.add(per9);
        peopleSet.add(per10);

        System.out.println("In collection Set " + peopleSet.size() + " elements:");
        for (Person p1: peopleSet) {
            System.out.println(p1);
        }
        System.out.println();

        Person per11 = new Person("Hanna", "Stiv", Gender.FEMALE);
        Person per12 = new Person("Henry", "Stiv", Gender.MALE);
        Person per13 = new Person("Kitty", "Boul", Gender.FEMALE);
        Person per14 = new Person("Henry", "Gob", Gender.MALE);
        Person per15 = new Person("Alis", "Gob", Gender.FEMALE);

        Map<Integer, Person> peopleMap = new HashMap<>();
        peopleMap.put(1, per11);
        peopleMap.put(2, per12);
        peopleMap.put(3, per13);
        peopleMap.put(4, per14);
        peopleMap.put(5, per15);

        System.out.println("In collection Map " + peopleMap.size() + " elements:");
        for (Map.Entry<Integer, Person> p2: peopleMap.entrySet()) {
            System.out.println(p2.getKey() + " - " + p2.getValue());
        }
    }
}
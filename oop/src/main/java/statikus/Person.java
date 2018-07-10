package statikus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {



    private int age;
    private LocalDate dob;
    private static List<Integer> lista = new ArrayList<>();
    static{
        Random rnd = new Random();
        for(int i = 0; i < 20; i++) {
            lista.add(rnd.nextInt(20));
        }
    }


    public Person(String name, int age, LocalDate dob) {
        this(name, age);
        this.dob = dob;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Hiba");
        }
        this.name = name;
    }

    private String name = "NM";

    public Person(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Túl fiatal.");
        }
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }
}

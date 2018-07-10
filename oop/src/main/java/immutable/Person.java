package immutable;

public class Person {

    private final String name;
    private final int age;
    private final Address address;
    private String[] hobbies = new String[10];
    private int numOfHobbies = 0;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void addHobbies(String... hobbies){
        for (String str: hobbies){
            if(numOfHobbies < 10) {
                this.hobbies[numOfHobbies] = str;
                numOfHobbies++;
            }
        }
    }

    public void addHobbies(String[] hobbies, int... freetime){
        addHobbies(hobbies);
        for(int i: freetime){
            //jiojkllé
        }
    }


}

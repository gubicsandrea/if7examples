package immutable;

public class ImmutableMain {

    public static void main(String[] args) {
        Address address = new Address("Bp", "Fő utca", 3);
        Person person = new Person("Kis Pista", 23, address);
        System.out.println(person);
        address.setNumber(5);
        person.getAddress();
        String[] hobbies = {"reading", "icecream", "bowling"};
        person.addHobbies(hobbies);
        person.addHobbies("fishing", "skiing");
        System.out.println(person);
    }
}

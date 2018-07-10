package overloading;

public class Example {

    private int number;

    public Example(int number) {
        this.number = number;
    }

    public void write(short s){
        System.out.println("in short");
    }

//    public void write(int s){ //1
//        System.out.println("in int");
//    }

    public void write(Short s){
        System.out.println("in Short");
    }

//    public void write(Integer s){ //2
//        System.out.println("in Integer");
//    }

//    public void write(Number s){ //3
//        System.out.println("in Number");
//    }

//    public void write(Object s){ //4
//        System.out.println("in Object");
//    }

//    public void write(int... s){ //5
//        System.out.println("in int...");
//    }

    public void write(Integer... s){ //6
        System.out.println("in Integer...");
    }

    public static void main(String[] args) {
        Example example = new Example(4);
        Example example1 = new Example(4);
        example.write(5);
        System.out.println(example.equals(example1));
    }


    public String toString(int x){
        return "furjiscd";
    }

    public boolean equals(Example ex2){
        return this.number == ex2.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Example example = (Example) o;

        return number == example.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}

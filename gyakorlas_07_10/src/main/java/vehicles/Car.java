package vehicles;

public class Car extends Vehicle {

    private String rendszam;
    private int uzemanyagMennyiseg;

    private final int maxUzemanyag;

    public Car(String rendszam, int uzemanyagMennyiseg, int sebesseg, int maxUzemanyag, int gears) {
        super(sebesseg, gears);
        this.rendszam = rendszam;
        this.uzemanyagMennyiseg = uzemanyagMennyiseg;
        this.maxUzemanyag = maxUzemanyag;
    }

    public Car(String rendszam, int maxUzemanyag) {
        this(rendszam, 0, 0, maxUzemanyag,5);
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getUzemanyagMennyiseg() {
        return uzemanyagMennyiseg;
    }


    public int tankolas(int liter) {
        int tankolas = liter;
        if (maxUzemanyag < uzemanyagMennyiseg + liter) {
            tankolas = maxUzemanyag - uzemanyagMennyiseg;
        }
        uzemanyagMennyiseg += tankolas;
        return tankolas;
    }
}

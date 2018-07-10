package enums;

public class EnumMain {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.YELLOW;
        System.out.println(light.getValue());
        light = TrafficLight.GREEN;
        System.out.println(light.getValue());
        light = light.next();
        System.out.println(light);
        light.ordinal();
        TrafficLight trf = TrafficLight.valueOf("RED");
        TrafficLight[] lights = TrafficLight.values();
        for (TrafficLight lig : lights){
            System.out.println(lig);
        }
    }
}

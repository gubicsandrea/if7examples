package enums;

public enum TrafficLight {
    RED(5) {
        @Override
        public TrafficLight next() {
            return RED_YELLOW;
        }
    },
    YELLOW(3) {
        @Override
        public TrafficLight next() {
            return RED;
        }
    },
    RED_YELLOW(8) {
        @Override
        public TrafficLight next() {
            return GREEN;
        }

        public void print(){
            System.out.println("IZÉÉÉ");
        }
    },
    GREEN(0){
        @Override
        public int getValue() {
            return -1;
        }

        @Override
        public TrafficLight next() {
            return YELLOW;
        }
    };

    private int value;

    private TrafficLight(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public abstract TrafficLight next();

}

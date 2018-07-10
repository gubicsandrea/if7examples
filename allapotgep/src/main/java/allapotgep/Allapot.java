package allapotgep;

public enum Allapot {

    A{
        @Override
        public Allapot next(int x) {
            if(x == 1){
                return B;
            }
            if(x == 5){
                return C;
            }
            return this;
        }
    },
    B{
        @Override
        public Allapot next(int x) {
            return C;
        }
    },
    C{
        @Override
        public Allapot next(int x) {
            return this;
        }
    },
    D{
        @Override
        public Allapot next(int x) {
            if(x == 0) {
                return A;
            }
            if(x < 0){
                return C;
            }
            return this;
        }
    };

    public abstract Allapot next(int x);
}

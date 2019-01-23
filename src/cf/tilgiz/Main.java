package cf.tilgiz;

public class Main {

    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.trans.shutdown();

        new Computer(){
            void superComp(){
                this.i7.start();
                this.trans.shutdown();
            }
        };
    }
}

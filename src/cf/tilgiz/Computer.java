package cf.tilgiz;

class Computer {
    class Processor{
        private boolean isStart = false;

        void start(){
            isStart = true;
        }
        void shutdown(){
            isStart = false;
        }
    }

    class Ram {
        private boolean isStart = false;

        void start(){
            isStart = true;
            System.out.println("isStart is " + isStart);
        }
        void shutdown(){
            isStart = false;
            System.out.println("isStart is " + isStart);
        }

    }

    Processor i7 = new Processor();
    Ram trans = new Ram();
}

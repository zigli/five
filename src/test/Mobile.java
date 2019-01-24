package test;

class Mobile extends Computer{
    Phone createPhone() {
        return new Phone() {
            @Override
            void processor() {
                super.processor();
                System.out.println("Mobile_");
            }
        };

    }
    void processor(){
        super.processor();
        System.out.println("Mobile");
    }
}

public class Android extends Device implements Mobile {
    Android(boolean portable){
        super(portable);
    }

    @Override
    public void display(){
        System.out.println("Device is Android");
        super.printInfo();
    }

    @Override
    public void receiveCall(){
        System.out.println("Android receiving call");
    }

    @Override
    public void declineCall(){
        System.out.println("Android declined call");
    }

}

public class Iphone extends Device implements Mobile{
    Iphone(boolean portable){
        super(portable);
    }

    @Override
    public void display(){
        System.out.println("Device is IPhone");
        super.printInfo();
    }

    @Override
    public void receiveCall(){
        System.out.println("IPhone receiving call");
    }

    @Override
    public void declineCall(){
        System.out.println("IPhone declined call");
    }
}

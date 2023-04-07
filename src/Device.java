abstract class Device {
    public boolean portable;

    Device(boolean portable){
        this.portable = portable;
    }

    abstract void display();

    public void printInfo(){
        System.out.println("Portable = " + this.portable);
    }
}

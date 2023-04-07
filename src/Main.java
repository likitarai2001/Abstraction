public class Main {
    public static void main(String[] args) {
        Android android = new Android(true);
        android.display();
        android.receiveCall();
        android.declineCall();

        Iphone iphone = new Iphone(true);
        iphone.display();
        iphone.receiveCall();
        iphone.declineCall();
    }
}
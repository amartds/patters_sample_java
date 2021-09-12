package criational.factory.apple.before.model;

public abstract class Iphone {

    public abstract void getHard();

    public abstract String getType();

    public void mounted() {
        System.out.println("mounted all hardware in the device");
    }

    public void validatePhone() {
        System.out.println("validated all behaviors phone");
    }

    public void packTheDevice() {
        System.out.println("shipping the phone to the owner client");
    }
}

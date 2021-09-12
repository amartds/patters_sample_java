package criational.factory.apple.before.model;

public class Iphone11 extends Iphone {

    public void getHard() {
        System.out.println("step one, mounted the phone to the client");
        System.out.println("step two, verified the behaviors in the phone");
        System.out.println("step three, shipped for the owner client");
    }

    @Override
    public String getType() {
        return "IPHONE 11";
    }
}

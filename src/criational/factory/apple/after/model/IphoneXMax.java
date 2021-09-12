package criational.factory.apple.after.model;

public class IphoneXMax extends Iphone {

    public void getHard() {
        System.out.println("## step one, mounted the phone to the client");
        System.out.println("## step two, verified the behaviors in the phone");
        System.out.println("## step three, shipped for the owner client");
    }

    public String getType() {
        return "IphoneXMax";
    }
}

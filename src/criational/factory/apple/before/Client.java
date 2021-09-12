package criational.factory.apple.before;

import criational.factory.apple.before.model.*;

public class Client {

    public Iphone order(String generation, String level) {
        Iphone device = null;

        if(generation.equals("X")) {
            if(level.equals("standard")){
                device = new IphoneX();
            } else if(level.equals("highEnd")) {
                device = new IphoneXMax();
            }
        } else if(generation.equals("11")) {
            if(level.equals("standard")) {
                device = new Iphone11();
            } else if(level.equals("highEnd")) {
                device = new Iphone11Pro();
            }
        }
        return device;
    }

    public static void main(String[] args) {

        System.out.println("################################################################################");

        Client client = new Client();
        Iphone iphone = client.order("X", "highEnd");
        System.out.println("## "+ iphone.getType());

        System.out.println("################################################################################");

        Client client2 = new Client();
        Iphone iphone2 = client.order("11", "standard");
        System.out.println("## "+ iphone2.getType());

        System.out.println("################################################################################");

        Client client3 = new Client();
        Iphone iphone3 = client.order("X", "standard");
        System.out.println("## "+ iphone3.getType());

        System.out.println("################################################################################");

        Client client4 = new Client();
        Iphone iphone4 = client.order("11", "standard");
        System.out.println("## "+ iphone4.getType());

        System.out.println("################################################################################");
    }
}

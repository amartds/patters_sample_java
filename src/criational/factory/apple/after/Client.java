package criational.factory.apple.after;

import criational.factory.apple.after.factory.*;
import criational.factory.apple.after.model.Iphone;

public class Client {

    public static void main(String[] args) {

        System.out.println("#################################################");

        IphoneFactory phone11 = new Iphone11Factory();
        Iphone iphone = phone11.orderIphone();
        System.out.println("##"+iphone.getType());

        System.out.println("#################################################");

        IphoneFactory phone11Pro = new Iphone11ProFactory();
        Iphone iphone2 = phone11Pro.orderIphone();
        System.out.println("##"+iphone2.getType());

        System.out.println("#################################################");

        IphoneFactory iphoneX = new IphoneXFactory();
        Iphone iphone3 = iphoneX.orderIphone();
        System.out.println("##"+iphone3.getType());

        System.out.println("#################################################");

        IphoneFactory iphoneXMax = new IphoneXMaxFactory();
        Iphone iphone4 = iphoneXMax.orderIphone();
        System.out.println("##"+iphone4.getType());

        System.out.println("#################################################");

    }
}

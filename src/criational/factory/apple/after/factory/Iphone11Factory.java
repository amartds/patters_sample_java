package criational.factory.apple.after.factory;

import criational.factory.apple.after.model.Iphone11;
import criational.factory.apple.after.model.Iphone;

public class Iphone11Factory extends IphoneFactory{

    public Iphone createIphone() {
        return new Iphone11();
    }
}

package criational.factory.apple.after.factory;

import criational.factory.apple.after.model.Iphone;
import criational.factory.apple.after.model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{

    @Override
    protected Iphone createIphone() {
       return new Iphone11Pro();
    }
}

package criational.factory.apple.after.factory;

import criational.factory.apple.after.model.Iphone;
import criational.factory.apple.after.model.IphoneX;

public class IphoneXFactory extends IphoneFactory {

    @Override
    protected Iphone createIphone() {
       return new IphoneX();
    }
}

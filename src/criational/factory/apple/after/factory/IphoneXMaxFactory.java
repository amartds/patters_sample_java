package criational.factory.apple.after.factory;

import criational.factory.apple.after.model.Iphone;
import criational.factory.apple.after.model.IphoneXMax;

public class IphoneXMaxFactory extends IphoneFactory {

    @Override
    protected Iphone createIphone() {
       return new IphoneXMax();
    }
}

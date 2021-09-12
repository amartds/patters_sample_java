package criational.factory.apple.after.factory;

import criational.factory.apple.after.model.Iphone;
// ############### the iphone Factory
public abstract class IphoneFactory {

    public Iphone orderIphone() {
        Iphone device = null;

        device = createIphone();

        device.getHard();
        device.getType();

        return device;
    }

    protected abstract Iphone createIphone();
}

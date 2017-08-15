package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class FYBInterstitialController extends NSObject {

    /**
//     *  The object that acts as the delegate of the Interstitial controller
//     *
//     *  @discussion The delegate must adopt the FYBInterstitialControllerDelegate protocol. The delegate is not retained
//     *
//     *  @see FYBInterstitialControllerDelegate
//     */
//    @property (nonatomic, weak) id<FYBInterstitialControllerDelegate> delegate;

    @Property(selector = "delegate")
    public native FYBInterstitialControllerDelegate getDelegate();

    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FYBInterstitialControllerDelegate delegate);


//    /**
//     *  Requests an Interstitial
//     *
//     *  @discussion You need to set the delegate property of this controller in order to be aware of the request and to show the Interstitial cycle
//     *
//     *  @see FYBInterstitialControllerDelegate
//     */
//    - (void)requestInterstitial;

    @Method(selector = "requestInterstitial")
    public native void requestInterstitial();

//    /**
//     *  Presents an Interstitial
//     *
//     *  @discussion One of the requestInterstitial methods above needs to be called before presenting the controller
//     *              You also need to make sure that an Interstitial has been received before trying to present the controller. For that you need to implement
//     *              the FYBInterstitialControllerDelegate protocol and set the delegate property of the controller
//     *
//     *  @param viewController The view controller where the controller is presented
//     */
//    - (void)presentInterstitialFromViewController:(UIViewController *)viewController;
    @Method(selector = "presentInterstitialFromViewController:")
    public native void presentInterstitial(UIViewController viewController);

}

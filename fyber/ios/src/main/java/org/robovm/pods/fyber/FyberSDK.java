package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.pods.google.mobileads.GADRequest;


@NativeClass
public class FyberSDK extends NSObject {

    private FyberSDK() {
    }

    @Property(selector = "shouldShowToastOnReward")
    public native boolean shouldShowToastOnReward ();

    @Property(selector = "setShouldShowToastOnReward:")
    public native void setShouldShowToastOnReward (boolean setShouldShowToastOnReward);


///**
// *  Accessor to retrieve the controller for Rewarded Videos
// *
// *  @return The FYBRewardedVideoController singleton
// */
//    + (FYBRewardedVideoController *)rewardedVideoController;
    @Method(selector = "rewardedVideoController")
    public static native FYBRewardedVideoController rewardedVideoController();

//    /**
//     *  Accessor to retrieve the controller for Interstitials
//     *
//     *  @return The FYBInterstitialController singleton
//     */
//    + (FYBInterstitialController *)interstitialController;
    @Method(selector = "interstitialController")
    public static native FYBInterstitialController interstitialController();


    @Method(selector = "startWithOptions:")
    public static native GADRequest start(FYBSDKOptions options);

    @Method(selector = "instance")
    public static native FyberSDK getInstance();

//    /**
//     *  Sets the log level
//     *
//     *  @param level The level of logging you want to see. By default the log level is set to FYBLogLevelInfo
//     *
//     *  @see FYBLogLevel
//     */
//    + (void)setLoggingLevel:(FYBLogLevel)level;

    @Method(selector = "setLoggingLevel:")
    public static native void setLoggingLevel(FYBLogLevel logLevel);


}

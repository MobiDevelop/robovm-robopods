package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class FYBRewardedVideoController extends NSObject {

    /**
//     *  The object that acts as the delegate of the Rewarded Video controller
//     *
//     *  @discussion The delegate must adopt the FYBRewardedVideoControllerDelegate protocol. The delegate is not retained
//     *
//     *  @see FYBRewardedVideoControllerDelegate
//     */
//    @property (nonatomic, weak) id<FYBRewardedVideoControllerDelegate>delegate;

    @Property(selector = "delegate")
    public native FYBRewardedVideoControllerDelegate getDelegate();

    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FYBRewardedVideoControllerDelegate delegate);

//    /**
//     *  If set to YES the SDK will show a toast-like notification to the user after completing an engagement
//     *  An example notification would be "Thanks! Your reward will be paid out shortly"
//     *
//     *  @discussion Default value is YES
//     */
//    @property (nonatomic, assign) BOOL shouldShowToastOnCompletion;

    @Property(selector = "shouldShowToastOnCompletion")
    public native String shouldShowToastOnCompletion ();

    @Property(selector = "setShouldShowToastOnCompletion:")
    public native void setShouldShowToastOnCompletion (boolean setShouldShowToastOnCompletion);

//    /**
//     *  Queries the server for Rewarded Video offers
//     *
//     *  @discussion You need to set the delegate property of this controller in order to be aware of the request and show cycle of the Rewarded Video
//     *
//     *  @see FYBVirtualCurrencyClientDelegate
//     */
//    - (void)requestVideo;

    @Method(selector = "requestVideo")
    public native void requestVideo();


//    /**
//     *  Presents the Rewarded Video controller
//     *
//     *  @discussion One of the requestVideo methods above needs to be called before presenting the controller
//     *              You must ensure a Rewarded Video has been received before trying to present the controller. For that you need to implement
//     *              the FYBRewardedVideoControllerDelegate protocol and set the delegate property of the controller
//     *
//     *  @param viewController The view controller on top of which the controller is presented
//     */
//    - (void)presentRewardedVideoFromViewController:(UIViewController *)viewController;

    @Method(selector = "presentRewardedVideoFromViewController:")
    public native void presentRewardedVideo(UIViewController viewController);

}

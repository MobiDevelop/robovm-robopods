package org.robovm.pods.fyber;

import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;


//@CustomClass("FYBIntegrationAnalyzerViewController")
@NativeClass
public class FYBIntegrationAnalyzerViewController extends UIViewController {

//    /**
//     *  Presents a full-screen view controller with information about the FyberSDK and the integrated bundles
//     *
//     *  @discussion The view controller presented by this method is a visual representation of the FYBIntegrationReport object returned by [FYBIntegrationAnalyzer analyzeWithCompletionHandler:]
//     *
//     *  @param viewController The view controller on top of which the controller is presented
//     */
//    + (void)presentFromViewController:(nonnull UIViewController *)viewController;
    @Method(selector = "presentFromViewController:")
    public native static void presentFromViewController(UIViewController viewController);
}

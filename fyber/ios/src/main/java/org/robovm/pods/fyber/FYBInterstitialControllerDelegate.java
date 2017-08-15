package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface FYBInterstitialControllerDelegate extends NSObjectProtocol {


///**
// *  The interstitial controller received an interstitial offer
// *
// *  @param interstitialController The interstitial controller that received the interstitial offer
// */
//    - (void)interstitialControllerDidReceiveInterstitial:(FYBInterstitialController *)interstitialController;
//

    @Method(selector = "interstitialControllerDidReceiveInterstitial:")
    void didReceiveInterstitial(FYBInterstitialController interstitialController);


///**
// *  The interstitial controller failed to receive the interstitial offer
// *
// *  @param interstitialController  The interstitial controller that failed to receive the interstitial offer
// *  @param error                   The error that occurred during the request of the interstitial offer
// */
//    - (void)interstitialController:(FYBInterstitialController *)interstitialController didFailToReceiveInterstitialWithError:(NSError *)error;
//

    @Method(selector = "interstitialController:didFailToReceiveInterstitialWithError:")
    void didFailToReceiveInterstitial(FYBInterstitialController interstitialController, NSError error);


//
///**
// *  The interstitial controller showed an interstitial offer
// *
// *  @param interstitialController  The interstitial controller that showed the interstitial offer
// */
//    - (void)interstitialControllerDidPresentInterstitial:(FYBInterstitialController *)interstitialController;
//

    @Method(selector = "interstitialControllerDidPresentInterstitial:")
    void didPresentInterstitial(FYBInterstitialController interstitialController);

//
///**
// *  The interstitial controller dismissed the interstitial
// *
// *  @param interstitialController  The interstitial controller that dismissed the interstitial
// *  @param reason                  The reason why the interstitial was dismissed.
// *  @see FYBInterstitialControllerDismissReason
// */
//    - (void)interstitialController:(FYBInterstitialController *)interstitialController didDismissInterstitialWithReason:(FYBInterstitialControllerDismissReason)reason;
//
    @Method(selector = "interstitialController:didDismissInterstitialWithReason:")
    void didDismissInterstitial(FYBInterstitialController interstitialController, FYBInterstitialControllerDismissReason reason);


///**
// *  The interstitial controller failed to show an interstitial offer
// *
// *  @param interstitialController  The interstitial controller that failed to show the interstitial offer
// *  @param error                   The error that occurred while trying to show the interstitial
// */
//    - (void)interstitialController:(FYBInterstitialController *)interstitialController didFailToPresentInterstitialWithError:(NSError *)error;

    @Method(selector = "interstitialController:didFailToPresentInterstitialWithError:")
    void didFailToPresentInterstitial(FYBInterstitialController interstitialController, NSError error);
}

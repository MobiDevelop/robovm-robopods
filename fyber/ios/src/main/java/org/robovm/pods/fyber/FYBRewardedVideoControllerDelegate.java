package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface FYBRewardedVideoControllerDelegate extends NSObjectProtocol {

//    /**
//     *  The Rewarded Video controller received a video offer
//     *
//     *  @param rewardedVideoController The Rewarded Video controller that received the video offer
//     *
//     *  @discussion Even though optional, we strongly recommend that you implement this delegate method in order to know when a Rewarded Video is ready to be shown
//     */
//    - (void)rewardedVideoControllerDidReceiveVideo:(FYBRewardedVideoController *)rewardedVideoController;
//
    @Method(selector = "rewardedVideoControllerDidReceiveVideo:")
    void didReceiveVideo(FYBRewardedVideoController rewardedVideoController);

///**
// *  The Rewarded Video controller failed to receive the video offer
// *
// *  @param rewardedVideoController The Rewarded Video controller that failed to receive the video offer
// *  @param error                   The error that occurred during the request of the video offer
// */
//    - (void)rewardedVideoController:(FYBRewardedVideoController *)rewardedVideoController didFailToReceiveVideoWithError:(NSError *)error;
//

    @Method(selector = "rewardedVideoController:didFailToReceiveVideoWithError:")
    void didFailToReceiveVideo(FYBRewardedVideoController rewardedVideoController, NSError error);

//
//    #pragma mark - Show Rewarded Video
//
///**
// *  The Rewarded Video controller started playing a video offer
// *
// *  @param rewardedVideoController The Rewarded Video controller that played the video offer
// */
//    - (void)rewardedVideoControllerDidStartVideo:(FYBRewardedVideoController *)rewardedVideoController;
//
//

    @Method(selector = "rewardedVideoControllerDidStartVideo:")
    void didStartVideo(FYBRewardedVideoController rewardedVideoController);


///**
// *  The Rewarded Video controller dismissed the rewarded video
// *
// *  @param rewardedVideoController The Rewarded Video controller that dismissed the rewarded video
// *  @param reason                  The reason why the video was dismissed
// *
// *  @see FYBRewardedVideoControllerDismissReason
// */
//    - (void)rewardedVideoController:(FYBRewardedVideoController *)rewardedVideoController didDismissVideoWithReason:(FYBRewardedVideoControllerDismissReason)reason;
//

    @Method(selector = "rewardedVideoController:didDismissVideoWithReason:")
    void didDismissVideo(FYBRewardedVideoController rewardedVideoController, FYBRewardedVideoControllerDismissReason reason);

///**
// *  The Rewarded Video controller failed to show the video offer
// *
// *  @param rewardedVideoController The Rewarded Video controller that failed to show the video offer
// *  @param error                   The error that occurred while trying to play the video offer
// */
//    - (void)rewardedVideoController:(FYBRewardedVideoController *)rewardedVideoController didFailToStartVideoWithError:(NSError *)error;

    @Method(selector = "rewardedVideoController:didFailToStartVideoWithError:")
    void didFailToStartVideo(FYBRewardedVideoController rewardedVideoController, NSError error);

}

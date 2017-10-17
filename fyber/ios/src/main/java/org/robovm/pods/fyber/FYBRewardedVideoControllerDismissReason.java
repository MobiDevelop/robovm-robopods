package org.robovm.pods.fyber;

import org.robovm.rt.bro.ValuedEnum;

public enum FYBRewardedVideoControllerDismissReason implements ValuedEnum {
//
//    /**
//     *  An error occurred while playing the video
//     */
//    FYBRewardedVideoControllerDismissReasonError = -1,
//
//    /**
//     *  The video played until the end and the player was dismissed
//     */
//    FYBRewardedVideoControllerDismissReasonUserEngaged,
//
//    /**
//     *  The video was aborted by the user
//     */
//    FYBRewardedVideoControllerDismissReasonAborted

    FYBRewardedVideoControllerDismissReasonError(-1),
    FYBRewardedVideoControllerDismissReasonUserEngaged(0),
    FYBRewardedVideoControllerDismissReasonAborted(1);

    private final long n;

    FYBRewardedVideoControllerDismissReason(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }
}

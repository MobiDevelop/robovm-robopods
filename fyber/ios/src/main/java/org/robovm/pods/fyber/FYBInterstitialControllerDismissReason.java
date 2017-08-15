package org.robovm.pods.fyber;

import org.robovm.rt.bro.ValuedEnum;

public enum FYBInterstitialControllerDismissReason implements ValuedEnum {

    /**
     *  The Interstitial controller was dismissed for an unknown reason
     */
    FYBInterstitialControllerDismissReasonError(-1),

    /**
     *  The Interstitial controller was closed because the user clicked on the ad
     */
    FYBInterstitialControllerDismissReasonUserEngaged(0),

    /**
     *  The Interstitial controller was explicitly closed by the user
     */
    FYBInterstitialControllerDismissReasonAborted(1),

    /**
     *  The Interstitial controller was closed because the video interstitial ended
     */
    FYBInterstitialControllerDismissReasonVideoEnded(2)
    ;

    private final long n;

    FYBInterstitialControllerDismissReason(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }
}

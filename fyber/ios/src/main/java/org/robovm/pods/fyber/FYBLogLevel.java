package org.robovm.pods.fyber;

import org.robovm.rt.bro.ValuedEnum;


public enum FYBLogLevel implements ValuedEnum {
    FYBLogLevelOff(0),
    FYBLogLevelDebug(10),
    FYBLogLevelInfo(20),
    FYBLogLevelWarn(30),
    FYBLogLevelError(40);

    private final long n;

    FYBLogLevel(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }
}

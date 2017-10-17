package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class FYBMediationBundleInfo extends NSObject {


///**
// * The name of the network
// */
//    @property (nonatomic, copy, readonly, nonnull) NSString *networkName;
    @Property(selector = "networkName")
    public native String getNetworkName();
//
///**
// * The version of the bundle
// */
//    @property (nonatomic, copy, readonly, nullable) NSString *version;

    @Property(selector = "version")
    public native String getVersion();

//
///**
// * The error that occurred during the initialization of the bundle, if any.
// *
// * @discussion The possible error codes for this property are defined in FYBMediationBundleInitializationErrorReason.
// */
//    @property (nonatomic, strong, readonly, nullable) NSError *initializationError;

    @Property(selector = "initializationError")
    public native NSError getInitializationError();
}

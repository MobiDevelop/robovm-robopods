package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;


@NativeClass
public class FYBIntegrationReport extends NSObject {

//    /**
//     *  The version of the Test Suite
//     */
//    @property (nonatomic, strong, readonly) NSString *testSuiteVersion;
//
    @Property(selector = "testSuiteVersion")
    public native String getTestSuiteVersion();

///**
// *  The version of the FyberSDK
// */
//    @property (nonatomic, strong, readonly) NSString *sdkVersion;
    @Property(selector = "sdkVersion")
    public native String getSdkVersion();
//
///**
// *  The App ID that was used to start the SDK
// */
//    @property (nonatomic, strong, readonly) NSString *appId;
    @Property(selector = "appId")
    public native String getAppId();
//
///**
// *  The User ID that was used to start the SDK
// */
//    @property (nonatomic, strong, readonly) NSString *userId;
    @Property(selector = "userId")
    public native String getUserId();
//
//    /**
//     *  The cookie accept policy configuration for the shared cookie storage
//     */
//    @property (nonatomic, assign, readonly) NSHTTPCookieAcceptPolicy cookieAcceptPolicy;
//
///**
// *  The list of bundles started by the SDK
// */
//    @property (nonatomic, strong, readonly) NSArray<FYBMediationBundleInfo *> *startedBundles;

    @Property(selector = "startedBundles")
    public native NSArray<FYBMediationBundleInfo> getStartedBundles();
//
///**
// *  The list of bundles not started by the SDK
// */
//    @property (nonatomic, strong, readonly) NSArray<FYBMediationBundleInfo *> *unstartedBundles;
    @Property(selector = "unstartedBundles")
    public native NSArray<FYBMediationBundleInfo> getUnstartedBundles();

}

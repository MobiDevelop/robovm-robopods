package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class FYBSDKOptions extends NSObject {


    private FYBSDKOptions() {}

    //    /**
//     *  Constructor
//     *
//     *  @param appId         Your application ID
//     *  @param securityToken Your security Token
//     *
//     *  @return An instance of FYBSDKOptions configured with an appId, a automatically generated userId and a securityToken
//     */
//    + (FYBSDKOptions *)optionsWithAppId:(NSString *)appId securityToken:(NSString *)securityToken;
    @Method(selector = "optionsWithAppId:securityToken:")
    public static native FYBSDKOptions getOptions(String appId, String securityToken);

}

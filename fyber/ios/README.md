# Fyber iOS

## Sample app

TODO

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from https://ios.fyber.com/docs/integrating-sdk#Manual
2. Put the `libFyberSDK-8.X.X.a` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFyberSDK-8.X.X.a</lib>
    </libs>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-fyber-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-fyber-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can display any ads, you have to setup the SDK.

#### Start Fyber in your app

Add the following code to your application's entry point, typically `didFinishLaunching()`
in your app delegate.

```Java
FyberSDK.start(FYBSDKOptions.getOptions(APP_ID, SECURITY_TOKEN));
```

Change the `APP_ID` and `SECURITY_TOKEN` with the id that you can find in your Fyber [dashboard](https://dashboard.fyber.com/).

#### Enable debug logging

When setting up Fyber it's very helpful to get logs.  
Add the following code before starting Fyber:

```Java
FyberSDK.setLoggingLevel(FYBLogLevel.FYBLogLevelDebug);

...

FyberSDK.start(FYBSDKOptions.getOptions(APP_ID, SECURITY_TOKEN));
```

__Note:__ Don't forget to disable debug logging when you release your app!

##### Having trouble?

- Make sure you have setup an app in your Fyber [dashboard](https://dashboard.fyber.com/)
and specified the correct `APP_ID` and `SECURITY_TOKEN`.
- Check your logs for any errors, like network failures.

##### Next steps

- Integrate 3rd party ad networks: [Link](#integrate-3rd-party-ad-networks)
- Read the official Fyber iOS documentation: [Link](https://ios.fyber.com/docs/)

### Integrate 3rd party ad networks

Fyber is also an ad mediation network, it allows integrating different ad providers under the same API.

#### Add 3rd party SDKs

You can use all ad networks that you setup in the Fyber mediation dashboard.  

Use the following link to download all SDKs of ad networks you want to integrate:

[Link](https://ios.fyber.com/docs/adding-partner-bundles)

Fyber bundles the 3rd party ad network SDKs inside it's adapters as .embeddedframework files. The .embeddedframework can be inspected with Finder.

For most adapters the .embededframework has no extra resources except from the .framework file. Follow these steps to integrate:
1. Extract the .embeddedframework content
2. Copy the `.framework` or `.a` files into your project `libs/` folder.
3. Also add an entry for each framework and library in your `robovm.xml`.

```xml
<frameworks>
    <framework>Fyber_Chartboost_6.6.3-r1</framework>
</frameworks>
```

In some special cases, the .embeddedframework may contain extra resources. Those resources must be manually be copied to your project.

#### Test integration

You can use the Mediation Test Suite to check if all networks are correctly setup. There are 2 methods to run the Test Suite supported by Fyber (https://ios.fyber.com/docs/testing-your-integration) but we currently only support the programatic one.

To use the Mediation Test Suite after you start the SDK:

```Java
HeyzapAds.start("PUBLISHER_ID");
    
FYBIntegrationAnalyzer.analyze(new FYBIntegrationAnalyzer.CompletionHandler() {
                @Override
                public void invoke(FYBIntegrationReport report, NSError error) {
                    if (error != null) {
                            Gdx.app.log(LOG, "Fyber Test suite Bundle Started:" + bundleInfo.getNetworkName() + " " + bundleInfo.getVersion());
                        }
                        for (FYBMediationBundleInfo bundleInfo : report.getUnstartedBundles()) {
                            Gdx.app.log(LOG, "Fyber Test suite Bundle NOT Started:" + bundleInfo.getNetworkName() + " " + bundleInfo.getVersion());
                        }
                    }
                }
            });
```

##### Having trouble?

- Check your logs for any errors, like network failures.

##### Next steps

- Load and display advertisements in your app: TODO
- Read the official Fyber iOS documentation: [Link](https://ios.fyber.com/docs/integrating-mediation-1)

##### Known Issues

- Banner related API has not been bound yet. Contributions welcome.


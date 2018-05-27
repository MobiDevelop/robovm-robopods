/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.mapbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLRasterStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLForegroundStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLRasterStyleLayerPtr extends Ptr<MGLRasterStyleLayer, MGLRasterStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLRasterStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLRasterStyleLayer() {}
    protected MGLRasterStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLRasterStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLRasterStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maximumRasterBrightness")
    public native MGLStyleValue<NSNumber> getMaximumRasterBrightness();
    @Property(selector = "setMaximumRasterBrightness:")
    public native void setMaximumRasterBrightness(MGLStyleValue<NSNumber> v);
    @Property(selector = "maximumRasterBrightnessTransition")
    public native @ByVal MGLTransition getMaximumRasterBrightnessTransition();
    @Property(selector = "setMaximumRasterBrightnessTransition:")
    public native void setMaximumRasterBrightnessTransition(@ByVal MGLTransition v);
    @Property(selector = "minimumRasterBrightness")
    public native MGLStyleValue<NSNumber> getMinimumRasterBrightness();
    @Property(selector = "setMinimumRasterBrightness:")
    public native void setMinimumRasterBrightness(MGLStyleValue<NSNumber> v);
    @Property(selector = "minimumRasterBrightnessTransition")
    public native @ByVal MGLTransition getMinimumRasterBrightnessTransition();
    @Property(selector = "setMinimumRasterBrightnessTransition:")
    public native void setMinimumRasterBrightnessTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterContrast")
    public native MGLStyleValue<NSNumber> getRasterContrast();
    @Property(selector = "setRasterContrast:")
    public native void setRasterContrast(MGLStyleValue<NSNumber> v);
    @Property(selector = "rasterContrastTransition")
    public native @ByVal MGLTransition getRasterContrastTransition();
    @Property(selector = "setRasterContrastTransition:")
    public native void setRasterContrastTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterFadeDuration")
    public native MGLStyleValue<NSNumber> getRasterFadeDuration();
    @Property(selector = "setRasterFadeDuration:")
    public native void setRasterFadeDuration(MGLStyleValue<NSNumber> v);
    @Property(selector = "rasterFadeDurationTransition")
    public native @ByVal MGLTransition getRasterFadeDurationTransition();
    @Property(selector = "setRasterFadeDurationTransition:")
    public native void setRasterFadeDurationTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterHueRotation")
    public native MGLStyleValue<NSNumber> getRasterHueRotation();
    @Property(selector = "setRasterHueRotation:")
    public native void setRasterHueRotation(MGLStyleValue<NSNumber> v);
    @Property(selector = "rasterHueRotationTransition")
    public native @ByVal MGLTransition getRasterHueRotationTransition();
    @Property(selector = "setRasterHueRotationTransition:")
    public native void setRasterHueRotationTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterOpacity")
    public native MGLStyleValue<NSNumber> getRasterOpacity();
    @Property(selector = "setRasterOpacity:")
    public native void setRasterOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "rasterOpacityTransition")
    public native @ByVal MGLTransition getRasterOpacityTransition();
    @Property(selector = "setRasterOpacityTransition:")
    public native void setRasterOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterSaturation")
    public native MGLStyleValue<NSNumber> getRasterSaturation();
    @Property(selector = "setRasterSaturation:")
    public native void setRasterSaturation(MGLStyleValue<NSNumber> v);
    @Property(selector = "rasterSaturationTransition")
    public native @ByVal MGLTransition getRasterSaturationTransition();
    @Property(selector = "setRasterSaturationTransition:")
    public native void setRasterSaturationTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}

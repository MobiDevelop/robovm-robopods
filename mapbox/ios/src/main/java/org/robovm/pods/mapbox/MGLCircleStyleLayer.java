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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLCircleStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLCircleStyleLayerPtr extends Ptr<MGLCircleStyleLayer, MGLCircleStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLCircleStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLCircleStyleLayer() {}
    protected MGLCircleStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLCircleStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLCircleStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "circleBlur")
    public native MGLStyleValue<NSNumber> getCircleBlur();
    @Property(selector = "setCircleBlur:")
    public native void setCircleBlur(MGLStyleValue<NSNumber> v);
    @Property(selector = "circleBlurTransition")
    public native @ByVal MGLTransition getCircleBlurTransition();
    @Property(selector = "setCircleBlurTransition:")
    public native void setCircleBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "circleColor")
    public native MGLStyleValue<UIColor> getCircleColor();
    @Property(selector = "setCircleColor:")
    public native void setCircleColor(MGLStyleValue<UIColor> v);
    @Property(selector = "circleColorTransition")
    public native @ByVal MGLTransition getCircleColorTransition();
    @Property(selector = "setCircleColorTransition:")
    public native void setCircleColorTransition(@ByVal MGLTransition v);
    @Property(selector = "circleOpacity")
    public native MGLStyleValue<NSNumber> getCircleOpacity();
    @Property(selector = "setCircleOpacity:")
    public native void setCircleOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "circleOpacityTransition")
    public native @ByVal MGLTransition getCircleOpacityTransition();
    @Property(selector = "setCircleOpacityTransition:")
    public native void setCircleOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "circlePitchAlignment")
    public native MGLStyleValue<NSValue> getCirclePitchAlignment();
    @Property(selector = "setCirclePitchAlignment:")
    public native void setCirclePitchAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "circleRadius")
    public native MGLStyleValue<NSNumber> getCircleRadius();
    @Property(selector = "setCircleRadius:")
    public native void setCircleRadius(MGLStyleValue<NSNumber> v);
    @Property(selector = "circleRadiusTransition")
    public native @ByVal MGLTransition getCircleRadiusTransition();
    @Property(selector = "setCircleRadiusTransition:")
    public native void setCircleRadiusTransition(@ByVal MGLTransition v);
    @Property(selector = "circleScaleAlignment")
    public native MGLStyleValue<NSValue> getCircleScaleAlignment();
    @Property(selector = "setCircleScaleAlignment:")
    public native void setCircleScaleAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "circleStrokeColor")
    public native MGLStyleValue<UIColor> getCircleStrokeColor();
    @Property(selector = "setCircleStrokeColor:")
    public native void setCircleStrokeColor(MGLStyleValue<UIColor> v);
    @Property(selector = "circleStrokeColorTransition")
    public native @ByVal MGLTransition getCircleStrokeColorTransition();
    @Property(selector = "setCircleStrokeColorTransition:")
    public native void setCircleStrokeColorTransition(@ByVal MGLTransition v);
    @Property(selector = "circleStrokeOpacity")
    public native MGLStyleValue<NSNumber> getCircleStrokeOpacity();
    @Property(selector = "setCircleStrokeOpacity:")
    public native void setCircleStrokeOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "circleStrokeOpacityTransition")
    public native @ByVal MGLTransition getCircleStrokeOpacityTransition();
    @Property(selector = "setCircleStrokeOpacityTransition:")
    public native void setCircleStrokeOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "circleStrokeWidth")
    public native MGLStyleValue<NSNumber> getCircleStrokeWidth();
    @Property(selector = "setCircleStrokeWidth:")
    public native void setCircleStrokeWidth(MGLStyleValue<NSNumber> v);
    @Property(selector = "circleStrokeWidthTransition")
    public native @ByVal MGLTransition getCircleStrokeWidthTransition();
    @Property(selector = "setCircleStrokeWidthTransition:")
    public native void setCircleStrokeWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "circleTranslation")
    public native MGLStyleValue<NSValue> getCircleTranslation();
    @Property(selector = "setCircleTranslation:")
    public native void setCircleTranslation(MGLStyleValue<NSValue> v);
    @Property(selector = "circleTranslationTransition")
    public native @ByVal MGLTransition getCircleTranslationTransition();
    @Property(selector = "setCircleTranslationTransition:")
    public native void setCircleTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "circleTranslationAnchor")
    public native MGLStyleValue<NSValue> getCircleTranslationAnchor();
    @Property(selector = "setCircleTranslationAnchor:")
    public native void setCircleTranslationAnchor(MGLStyleValue<NSValue> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
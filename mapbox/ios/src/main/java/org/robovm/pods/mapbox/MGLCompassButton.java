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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLCompassButton/*</name>*/ 
    extends /*<extends>*/UIImageView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLCompassButtonPtr extends Ptr<MGLCompassButton, MGLCompassButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLCompassButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLCompassButton() {}
    protected MGLCompassButton(Handle h, long handle) { super(h, handle); }
    protected MGLCompassButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:")
    public MGLCompassButton(UIImage image) { super(image); }
    @Method(selector = "initWithImage:highlightedImage:")
    public MGLCompassButton(UIImage image, UIImage highlightedImage) { super(image, highlightedImage); }
    @Method(selector = "initWithFrame:")
    public MGLCompassButton(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MGLCompassButton(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "compassVisibility")
    public native MGLOrnamentVisibility getCompassVisibility();
    @Property(selector = "setCompassVisibility:")
    public native void setCompassVisibility(MGLOrnamentVisibility v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}

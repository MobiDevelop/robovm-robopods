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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MGLCalloutView/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "representedObject")
    MGLAnnotation getRepresentedObject();
    @Property(selector = "setRepresentedObject:")
    void setRepresentedObject(MGLAnnotation v);
    @Property(selector = "leftAccessoryView")
    UIView getLeftAccessoryView();
    @Property(selector = "setLeftAccessoryView:")
    void setLeftAccessoryView(UIView v);
    @Property(selector = "rightAccessoryView")
    UIView getRightAccessoryView();
    @Property(selector = "setRightAccessoryView:")
    void setRightAccessoryView(UIView v);
    @Property(selector = "delegate")
    MGLCalloutViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    void setDelegate(MGLCalloutViewDelegate v);
    @Property(selector = "isAnchoredToAnnotation")
    boolean isAnchoredToAnnotation();
    @Property(selector = "dismissesAutomatically")
    boolean isDismissesAutomatically();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "presentCalloutFromRect:inView:constrainedToView:animated:")
    void presentCallout(@ByVal CGRect rect, UIView view, UIView constrainedView, boolean animated);
    @Method(selector = "dismissCalloutAnimated:")
    void dismissCalloutAnimated(boolean animated);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}

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
package com.bugvm.apple.watchkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSAttributedString;
import com.bugvm.apple.foundation.NSData;
import com.bugvm.apple.uikit.UIColor;
import com.bugvm.apple.uikit.UIImage;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WatchKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKInterfaceButton/*</name>*/ 
    extends /*<extends>*/WKInterfaceObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKInterfaceButtonPtr extends Ptr<WKInterfaceButton, WKInterfaceButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKInterfaceButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKInterfaceButton() {}
    protected WKInterfaceButton(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setTitle:")
    public native void setTitle(String title);
    @Method(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString attributedTitle);
    @Method(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor color);
    @Method(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage image);
    @Method(selector = "setBackgroundImageData:")
    public native void setBackgroundImageData(NSData imageData);
    @Method(selector = "setBackgroundImageNamed:")
    public native void setBackgroundImageNamed(String imageName);
    @Method(selector = "setEnabled:")
    public native void setEnabled(boolean enabled);
    /*</methods>*/
}
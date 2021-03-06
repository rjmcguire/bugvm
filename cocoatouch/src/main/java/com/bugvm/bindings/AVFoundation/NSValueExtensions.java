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
package com.bugvm.bindings.AVFoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSValueExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSValueExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSValueExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "CMTimeValue")
    public static native @ByVal CMTime getCMTimeValue(NSValue thiz);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "CMTimeRangeValue")
    public static native @ByVal CMTimeRange getCMTimeRangeValue(NSValue thiz);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "CMTimeMappingValue")
    public static native @ByVal CMTimeMapping getCMTimeMappingValue(NSValue thiz);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "valueWithCMTime:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTime time);
    public static NSValue create(@ByVal CMTime time) { return create(ObjCClass.getByType(NSValue.class), time); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "valueWithCMTimeRange:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTimeRange timeRange);
    public static NSValue create(@ByVal CMTimeRange timeRange) { return create(ObjCClass.getByType(NSValue.class), timeRange); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "valueWithCMTimeMapping:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTimeMapping timeMapping);
    public static NSValue create(@ByVal CMTimeMapping timeMapping) { return create(ObjCClass.getByType(NSValue.class), timeMapping); }
    /*</methods>*/
}

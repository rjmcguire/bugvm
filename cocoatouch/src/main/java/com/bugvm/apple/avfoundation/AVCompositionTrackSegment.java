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
package com.bugvm.apple.avfoundation;

/*<imports>*/

import com.bugvm.apple.coremedia.CMTimeRange;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCompositionTrackSegment/*</name>*/ 
    extends /*<extends>*/AVAssetTrackSegment/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCompositionTrackSegmentPtr extends Ptr<AVCompositionTrackSegment, AVCompositionTrackSegmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCompositionTrackSegment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCompositionTrackSegment() {}
    protected AVCompositionTrackSegment(SkipInit skipInit) { super(skipInit); }
    public AVCompositionTrackSegment(NSURL URL, int trackID, @ByVal CMTimeRange sourceTimeRange, @ByVal CMTimeRange targetTimeRange) { super((SkipInit) null); initObject(init(URL, trackID, sourceTimeRange, targetTimeRange)); }
    public AVCompositionTrackSegment(@ByVal CMTimeRange timeRange) { super((SkipInit) null); initObject(init(timeRange)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEmpty")
    public native boolean isEmpty();
    @Property(selector = "sourceURL")
    public native NSURL getSourceURL();
    @Property(selector = "sourceTrackID")
    public native int getSourceTrackID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:trackID:sourceTimeRange:targetTimeRange:")
    protected native @Pointer long init(NSURL URL, int trackID, @ByVal CMTimeRange sourceTimeRange, @ByVal CMTimeRange targetTimeRange);
    @Method(selector = "initWithTimeRange:")
    protected native @Pointer long init(@ByVal CMTimeRange timeRange);
    /*</methods>*/
}
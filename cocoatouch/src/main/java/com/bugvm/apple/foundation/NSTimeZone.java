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
package com.bugvm.apple.foundation;

/*<imports>*/
import java.util.*;

import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTimeZone/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 2.0 and later.
         */
        public static NSObject observeDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSTimeZonePtr extends Ptr<NSTimeZone, NSTimeZonePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTimeZone.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTimeZone() {}
    protected NSTimeZone(SkipInit skipInit) { super(skipInit); }
    public NSTimeZone(String tzName) { super((SkipInit) null); initObject(init(tzName)); }
    public NSTimeZone(String tzName, NSData aData) { super((SkipInit) null); initObject(init(tzName, aData)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "secondsFromGMT")
    public native @MachineSizedSInt long getSecondsFromGMT();
    @Property(selector = "abbreviation")
    public native String getAbbreviation();
    @Property(selector = "isDaylightSavingTime")
    public native boolean isDaylightSavingTime();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "daylightSavingTimeOffset")
    public native double getDaylightSavingTimeOffset();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "nextDaylightSavingTimeTransition")
    public native NSDate getNextDaylightSavingTimeTransition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="NSSystemTimeZoneDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "secondsFromGMTForDate:")
    public native @MachineSizedSInt long getSecondsFromGMTForDate(NSDate aDate);
    @Method(selector = "abbreviationForDate:")
    public native String getAbbreviationForDate(NSDate aDate);
    @Method(selector = "isDaylightSavingTimeForDate:")
    public native boolean isDaylightSavingTimeForDate(NSDate aDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "daylightSavingTimeOffsetForDate:")
    public native double getDaylightSavingTimeOffsetForDate(NSDate aDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "nextDaylightSavingTimeTransitionAfterDate:")
    public native NSDate getNextDaylightSavingTimeTransitionAfterDate(NSDate aDate);
    @Method(selector = "isEqualToTimeZone:")
    public native boolean equalsTo(NSTimeZone aTimeZone);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "localizedName:locale:")
    public native String getLocalizedName(NSTimeZoneNameStyle style, NSLocale locale);
    @Method(selector = "systemTimeZone")
    public static native NSTimeZone getSystemTimeZone();
    @Method(selector = "resetSystemTimeZone")
    public static native void resetSystemTimeZone();
    @Method(selector = "defaultTimeZone")
    public static native NSTimeZone getDefaultTimeZone();
    @Method(selector = "setDefaultTimeZone:")
    public static native void setDefaultTimeZone(NSTimeZone aTimeZone);
    @Method(selector = "localTimeZone")
    public static native NSTimeZone getLocalTimeZone();
    @Method(selector = "knownTimeZoneNames")
    public static native @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getKnownTimeZoneNames();
    @Method(selector = "abbreviationDictionary")
    public static native @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getAbbreviationDictionary();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "setAbbreviationDictionary:")
    public static native void setAbbreviationDictionary(@com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "timeZoneDataVersion")
    public static native String getTimeZoneDataVersion();
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String tzName);
    @Method(selector = "initWithName:data:")
    protected native @Pointer long init(String tzName, NSData aData);
    @Method(selector = "timeZoneWithName:")
    public static native NSTimeZone fromName(String tzName);
    @Method(selector = "timeZoneWithName:data:")
    public static native NSTimeZone fromName(String tzName, NSData aData);
    @Method(selector = "timeZoneForSecondsFromGMT:")
    public static native NSTimeZone fromGMTSecondsOffset(@MachineSizedSInt long seconds);
    @Method(selector = "timeZoneWithAbbreviation:")
    public static native NSTimeZone fromAbbreviation(String abbreviation);
    /*</methods>*/
}
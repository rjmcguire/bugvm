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
package com.bugvm.bindings.AdSupport;

import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;

@Library("AdSupport")
@NativeClass
public class ASIdentifierManager extends NSObject {
    public static class ASIdentifierManagerPtr extends Ptr<ASIdentifierManager, ASIdentifierManagerPtr> {}
    static { ObjCRuntime.bind(ASIdentifierManager.class); }
    public ASIdentifierManager() {}
    protected ASIdentifierManager(SkipInit skipInit) { super(skipInit); }
    @Property(selector = "advertisingIdentifier")
    public native NSUUID getAdvertisingIdentifier();
    @Property(selector = "isAdvertisingTrackingEnabled")
    public native boolean isAdvertisingTrackingEnabled();
    @Method(selector = "sharedManager")
    public static native ASIdentifierManager getSharedManager();
}
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
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/NSNumberFormatterStyle/*</name>*/ implements ValuedEnum {
    /*<values>*/
    No(0L),
    Decimal(1L),
    Currency(2L),
    Percent(3L),
    Scientific(4L),
    SpellOut(5L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    Ordinal(6L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CurrencyISOCode(8L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CurrencyPlural(9L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CurrencyAccounting(10L);
    /*</values>*/

    private final long n;

    private /*<name>*/NSNumberFormatterStyle/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NSNumberFormatterStyle/*</name>*/ valueOf(long n) {
        for (/*<name>*/NSNumberFormatterStyle/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NSNumberFormatterStyle/*</name>*/.class.getName());
    }
}
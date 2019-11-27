/*
 * Copyright (C) 2006 The Android Open Source Project
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

package android.os;

import android.os.SystemProperties;
import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

public class SystemPropertiesTest extends TestCase {
    private static final String KEY = "com.android.frameworks.coretests";
    @SmallTest
    public void testProperties() throws Exception {
        if (false) {
        String value;
       
        SystemProperties.set(KEY, "");
        value = SystemProperties.get(KEY, "default");
        assertEquals("default", value);

        SystemProperties.set(KEY, "AAA");
        value = SystemProperties.get(KEY, "default");
        assertEquals("AAA", value);

        value = SystemProperties.get(KEY);
        assertEquals("AAA", value);

        SystemProperties.set(KEY, "");
        value = SystemProperties.get(KEY, "default");
        assertEquals("default", value);

        value = SystemProperties.get(KEY);
        assertEquals("", value);
        }
    }
}